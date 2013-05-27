package com.kamitsoft.client.core.welcom;


import com.google.gwt.event.shared.GwtEvent.Type;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.login.LoginPresenter;
import com.kamitsoft.client.places.NamesTokens;


public class WelcomePresenter extends Presenter<WelcomePresenter.Display, WelcomePresenter.Proxy> {

	  public interface Display extends View {

		void addWidgetToSlider(Widget e);
		public void startSlider();
		  
	  };
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_Login = new Type<RevealContentHandler<?>>();
	  @Inject private LoginPresenter login; 
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.welcome)
	  public interface Proxy extends ProxyPlace<WelcomePresenter> {}
	  private Display display;
	 
	  
	  
	  @Inject
	  public WelcomePresenter(EventBus eventBus, Display view, Proxy proxy) {
		   super(eventBus, view, proxy);
		   display=view;
	    
	  }
	
	 
	  @Override
	  public void onBind(){
		  super.onBind();
		  
			  
	  }
	
	
	@Override
	protected void revealInParent() {
		RevealContentEvent.fire(this, MainPagePresenter.TYPE_MainContent, this);
		setInSlot(TYPE_Login, login);
	
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