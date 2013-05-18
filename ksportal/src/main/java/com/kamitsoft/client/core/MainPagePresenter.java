package com.kamitsoft.client.core;
import com.google.gwt.event.shared.GwtEvent.Type;

import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.Presenter;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.annotations.ContentSlot;
import com.gwtplatform.mvp.client.annotations.NameToken;
import com.gwtplatform.mvp.client.annotations.ProxyCodeSplit;
import com.gwtplatform.mvp.client.proxy.ProxyPlace;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.proxy.RevealRootContentEvent;

import com.kamitsoft.client.places.NamesTokens;

import com.kamitsoft.client.core.login.LoginPresenter;
import com.kamitsoft.client.core.verticalmenu.VMenuPresenter;;

public class MainPagePresenter extends Presenter<MainPagePresenter.Display, MainPagePresenter.Proxy> {

	  public interface Display extends View {};
	  
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_MainContent = new Type<RevealContentHandler<?>>();
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_HeaderContent = new Type<RevealContentHandler<?>>();
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_VMenuContent = new Type<RevealContentHandler<?>>();
	  
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.main)
	  public interface Proxy extends ProxyPlace<MainPagePresenter> {}
	  
	  
	  @Inject private VMenuPresenter verticalMenu;
	  @Inject private LoginPresenter loginPresentee;
	  
	  @Inject
	  public MainPagePresenter(EventBus eventBus, Display view, Proxy proxy) {
	    super(eventBus, view, proxy);
	  
	  }
	
	  @Override
	  protected void revealInParent() {
	    RevealRootContentEvent.fire( this, this );
	    setInSlot(TYPE_VMenuContent, verticalMenu);
	    setInSlot(TYPE_HeaderContent, loginPresentee);
	 
	  }
	
	  @Override
	  public void onBind(){
		  super.onBind();
		  
		  
	  }

	protected void displayClientMesures() {
		// TODO Auto-generated method stub
		
	}
	
	protected void displayClientCorrdonnees() {
		// TODO Auto-generated method stub
		
	}



}