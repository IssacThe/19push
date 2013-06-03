package com.kamitsoft.client.core.login.welcomelogin;
import java.util.ArrayList;

import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;
import com.kamitsoft.client.places.KSAPlaceManager;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.remote.rpc.UserAsync;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.user.UserInfo;
import com.kamitsoft.shared.beans.user.UserParameters;
import com.kamitsoft.shared.constants.LoginConstants;

public class WelcomeLoginPresenter extends Presenter<WelcomeLoginPresenter.Display, WelcomeLoginPresenter.Proxy> {

	  public interface Display extends View {
		  
			public void addWidgetToSlider(Widget e);
			public void startSlider();
			public String getAccountName();
			public String getUsername();
			public String getPassword();
			public void setLoginMessage(int msgCode);
			public void clearFields();
			public void addKeyHandler(KeyPressHandler keyPressHandler);
			public void clearMessage();
			
	  };
	  
	 
	  
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_Banner = new Type<RevealContentHandler<?>>();
	  
	  
	  
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.welcomelogin)
	  public interface Proxy extends ProxyPlace<WelcomeLoginPresenter> {}
	  
	  @Inject private PlaceManager placeManager;
	  @Inject private UserContext context;
	  @Inject
	  public WelcomeLoginPresenter(EventBus eventBus, Display view, Proxy proxy) {
	    super(eventBus, view, proxy);
	  
	  }
	
	  @Override
	  protected void revealInParent() {
		  RevealRootContentEvent.fire(this, this);
	  }
	
	  @Override
	  public void onBind(){
		  super.onBind();
		  getView().addKeyHandler(new KeyPressHandler(){
		
					@Override
					public void onKeyPress(KeyPressEvent event) {
						
						if (event.getUnicodeCharCode() == 0) {
							getView().clearMessage();
							if(getView().getAccountName().length()<=5){
								getView().setLoginMessage(LoginConstants.ACCOUNTID_TO_SMALL);
								return;
							}
							if(getView().getUsername().length()<=4){
								getView().setLoginMessage(LoginConstants.USERID_TO_SMALL);
								return;
							}
							if(getView().getPassword().length()<=4){
								getView().setLoginMessage(LoginConstants.PASSWORD_TO_SMALL);
								return;
							}
							tryLogin(getView().getAccountName(),getView().getUsername(),getView().getPassword());
						}
						
					}
		  	});
		  
	  }
	  
	protected void tryLogin(String account, String userName,  String userPassword) {
		UserParameters  params = new UserParameters();
		params.setAccountName(account);
		params.setUserName(userName);
		params.setPassword(userPassword);
		
		UserAsync userAsyn = UserAsync.Util.getInstance();
		userAsyn.login(params, new AsyncCallback<UserInfo>() {

			@Override
			public void onFailure(Throwable caught) {
				getView().setLoginMessage(LoginConstants.CREDENTIAL_INCORRECT);
				caught.printStackTrace();
			}

			@Override
			public void onSuccess(UserInfo userInfo) {
				if(userInfo!=null){
					context.init(userInfo);
					PlaceRequest request = new PlaceRequest(NamesTokens.welcome);
					placeManager.revealPlace(request,true);
				}
				
			}
		   
		  });
		
		
		
	}

	@Override
	 protected void onReveal() {
			super.onReveal();
			getView().addWidgetToSlider(new Image("http://www.mackoo.com/Mongolie/images/IMGP9640.jpg"));
			getView().addWidgetToSlider(new Image("http://www.mairie-etampes.fr/images/parcs_pergola1_panoramique.jpg"));
			getView().addWidgetToSlider(new Image("http://www.anb-immobilier.com/wp-content/uploads/2012/03/P1010594-450x200.jpg"));
			getView().addWidgetToSlider(new Image("http://www.cncbaviron.com/wp-content/uploads/2010/04/rando_lac_villeret.jpg"));
			getView().addWidgetToSlider(new Image("http://www.gesves-tourisme.be/fr/images/2.jpg"));
			getView().addWidgetToSlider(new Image("http://www.anb-immobilier.com/wp-content/uploads/2012/05/DSC_00024-450x200.jpg"));
			getView().addWidgetToSlider(new Image("http://nautilus-tours.com/gal/img/cat4/gal0027.jpg"));
			
			getView().startSlider();
	  }
	

	 

}