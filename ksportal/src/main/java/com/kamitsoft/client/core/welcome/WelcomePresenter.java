package com.kamitsoft.client.core.welcome;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.places.NamesTokens;
import com.kamitsoft.client.security.UserContext;


public class WelcomePresenter extends Presenter<WelcomePresenter.Display, WelcomePresenter.Proxy> {

	  public interface Display extends View {

	
		  
	  };
	  //@ContentSlot
	  //public static final Type<RevealContentHandler<?>> TYPE_Login = new Type<RevealContentHandler<?>>();
	  
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.welcome)
	  public interface Proxy extends ProxyPlace<WelcomePresenter> {}
	  private Display display;
	  @Inject private UserContext context;
	 
	  
	  
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
		
	
	}


	@Override
	protected void onReveal() {
		super.onReveal();
		
	}





}