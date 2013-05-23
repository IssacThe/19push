package com.kamitsoft.client.core;

import com.google.gwt.core.client.GWT;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwtplatform.mvp.client.proxy.NotifyingAsyncCallback;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.common.client.StandardProvider;
import com.gwtplatform.common.client.CodeSplitProvider;
import com.gwtplatform.common.client.CodeSplitBundleProvider;
import com.gwtplatform.mvp.client.proxy.ProxyImpl;
import com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl;
import com.gwtplatform.mvp.client.proxy.RevealContentHandler;
import com.gwtplatform.mvp.client.DelayedBind;
import com.gwtplatform.mvp.client.proxy.TabContentProxyPlaceImpl;
import com.gwtplatform.mvp.client.DelayedBindRegistry;
import com.google.gwt.inject.client.Ginjector;
import com.gwtplatform.mvp.client.proxy.RevealContentEvent;
import com.google.gwt.core.client.Scheduler;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.gwtplatform.mvp.client.TabData;
import com.gwtplatform.mvp.client.TabDataBasic;

public class MainPagePresenterProxyImpl extends com.gwtplatform.mvp.client.proxy.ProxyPlaceImpl<MainPagePresenter> implements com.kamitsoft.client.core.MainPagePresenter.Proxy, com.gwtplatform.mvp.client.DelayedBind {
  
  private com.kamitsoft.gin.KSAPortalGinjector ginjector;
  
  public static class WrappedProxy
  extends com.gwtplatform.mvp.client.proxy.ProxyImpl<MainPagePresenter> implements com.gwtplatform.mvp.client.DelayedBind {
    
    private com.kamitsoft.gin.KSAPortalGinjector ginjector;
    
    public WrappedProxy() {
    }
    
    @Override
    public void delayedBind(Ginjector baseGinjector) {
      ginjector = (com.kamitsoft.gin.KSAPortalGinjector)baseGinjector;
      bind(ginjector.getPlaceManager(),
          ginjector.getEventBus());
      presenter = new CodeSplitProvider<MainPagePresenter>( ginjector.getMainPagePresenter() );
      
      RevealContentHandler<MainPagePresenter> revealContentHandler = new RevealContentHandler<MainPagePresenter>( eventBus, this );
      getEventBus().addHandler( MainPagePresenter.TYPE_MainContent, revealContentHandler );
      getEventBus().addHandler( MainPagePresenter.TYPE_TopBar, revealContentHandler );
      getEventBus().addHandler( MainPagePresenter.TYPE_BottomBar, revealContentHandler );
    }
  }
  
  public MainPagePresenterProxyImpl() {
    DelayedBindRegistry.register(this);
  }
  
  @Override
  public void delayedBind(Ginjector baseGinjector) {
    ginjector = (com.kamitsoft.gin.KSAPortalGinjector)baseGinjector;
    bind(ginjector.getPlaceManager(),
        ginjector.getEventBus());
    WrappedProxy wrappedProxy = GWT.create(WrappedProxy.class);
    wrappedProxy.delayedBind( ginjector ); 
    proxy = wrappedProxy; 
    String nameToken = "!main"; 
    place = new com.gwtplatform.mvp.client.proxy.PlaceImpl( nameToken );
  }
}
