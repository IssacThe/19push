package com.kamitsoft.client.core.login.popuplogin;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyDownEvent;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupView;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.kamitsoft.remote.rpc.UserAsync;
import com.kamitsoft.client.event.UserLoginEvent;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.client.ui.loader.AsyncCall;
import com.kamitsoft.shared.beans.user.UserInfo;
import com.kamitsoft.shared.beans.user.UserParameters;
import com.kamitsoft.shared.constants.LoginConstants;


public class LoginPopupPresenter extends PresenterWidget<LoginPopupPresenter.Display> {

	public interface Display extends PopupView {

	  public HasText getPassword();
	  public HasText getUsername();
	  public HasClickHandlers getConnectClick();
	  public void setLoginMessage(int credentialIncorrect);
	  public void addKeyHandler(KeyDownHandler keyDownHandler);
	  public void clear();
	  
	}
	private Display display;

	@Inject private PlaceManager placeManager;
	@Inject private UserContext context;
	private EventBus eventBus; 
	  
	@Inject
	public LoginPopupPresenter(EventBus eventBus, Display view) {
	    super(eventBus, view);
	    display=view;
	    this.eventBus = eventBus;
	}
	
	 
	@Override
	public void onBind(){
		  super.onBind();
		  getView().getConnectClick().addClickHandler(new ClickHandler(){

			@Override
			public void onClick(ClickEvent event) {
				tryReLogin(context.getUserInfo().getAccountInfo().getAccountName(), 
						getView().getUsername().getText(),
						getView().getPassword().getText());
				
			}
			  
		  });
		  getView().addKeyHandler(new KeyDownHandler(){
				
				@Override
				public void onKeyDown(KeyDownEvent event) {
					if (event.getNativeKeyCode() == 13) {
						tryReLogin(context.getUserInfo().getAccountInfo().getAccountName(), 
								getView().getUsername().getText(),
								getView().getPassword().getText());
					}
				}
		  });
		  
		 
	}
	
	
	@Override
	protected void onReveal() {
		super.onReveal();
		

	}


	public void show() {
		getView().center();
		getView().clear();
		getView().getUsername().setText(context.getUserInfo().getUserName());
		getView().show();
		
	}

	 protected void tryReLogin(String account, String userName,  String userPassword) {
			UserParameters  params = new UserParameters();
			params.setAccountName(account);
			params.setUserName(userName);
			params.setPassword(userPassword);
			
			UserAsync userAsyn = UserAsync.Util.getInstance();
			userAsyn.login(params, new AsyncCall<UserInfo>() {
	
			
				@Override
				protected void didFail(Throwable caught) {
					getView().setLoginMessage(LoginConstants.CREDENTIAL_INCORRECT);
					
				}

				@Override
				protected void didSuccess(UserInfo userInfo) {
					if(userInfo!=null){
						getView().hide();
						
					}
				}
			   
			  });
			
	 }
	



}