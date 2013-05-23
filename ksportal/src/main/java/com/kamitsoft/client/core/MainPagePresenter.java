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

import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter;
import com.kamitsoft.client.core.bars.topbar.TopBarPresenter;
import com.kamitsoft.client.core.login.LoginPresenter;
import com.kamitsoft.client.core.welcom.WelcomePresenter;

public class MainPagePresenter extends Presenter<MainPagePresenter.Display, MainPagePresenter.Proxy> {

	  public interface Display extends View {};
	  
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_MainContent = new Type<RevealContentHandler<?>>();
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_TopBar = new Type<RevealContentHandler<?>>();
	  @ContentSlot
	  public static final Type<RevealContentHandler<?>> TYPE_BottomBar = new Type<RevealContentHandler<?>>();
	  
	  @ProxyCodeSplit
	  @NameToken(NamesTokens.main)
	  public interface Proxy extends ProxyPlace<MainPagePresenter> {}
	  
	  
	  @Inject private TopBarPresenter topBar;
	  @Inject private BottomBarPresenter bottomBar;
	  @Inject private WelcomePresenter welcom;
	  
	  @Inject
	  public MainPagePresenter(EventBus eventBus, Display view, Proxy proxy) {
	    super(eventBus, view, proxy);
	  
	  }
	
	  @Override
	  protected void revealInParent() {
	    RevealRootContentEvent.fire(this, this);
	    setInSlot(TYPE_TopBar, topBar);
	    setInSlot(TYPE_BottomBar, bottomBar);
	    setInSlot(TYPE_MainContent, welcom);
	    
	  }
	
	  @Override
	  public void onBind(){
		  super.onBind();
		  
		  
	  }

	



}