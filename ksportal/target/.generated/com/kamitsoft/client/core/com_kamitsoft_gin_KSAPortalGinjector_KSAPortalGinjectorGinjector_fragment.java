package com.kamitsoft.client.core;

import com.google.gwt.core.client.GWT;
import com.kamitsoft.gin.com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector;

public class com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$(com.kamitsoft.client.core.MainPagePresenter.Proxy injectee) {
    
  }
  
  public native void com$kamitsoft$client$core$MainPagePresenter_bottomBar_fieldInjection(com.kamitsoft.client.core.MainPagePresenter injectee, com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter value) /*-{
    injectee.@com.kamitsoft.client.core.MainPagePresenter::bottomBar = value;
  }-*/;
  
  public native void com$kamitsoft$client$core$MainPagePresenter_topBar_fieldInjection(com.kamitsoft.client.core.MainPagePresenter injectee, com.kamitsoft.client.core.bars.topbar.TopBarPresenter value) /*-{
    injectee.@com.kamitsoft.client.core.MainPagePresenter::topBar = value;
  }-*/;
  
  public native void com$kamitsoft$client$core$MainPagePresenter_welcom_fieldInjection(com.kamitsoft.client.core.MainPagePresenter injectee, com.kamitsoft.client.core.welcom.WelcomePresenter value) /*-{
    injectee.@com.kamitsoft.client.core.MainPagePresenter::welcom = value;
  }-*/;
  
  public void memberInject_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$(com.kamitsoft.client.core.MainPagePresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection___(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$kamitsoft$client$core$MainPagePresenter_bottomBar_fieldInjection(injectee, injector.getFragment_com_kamitsoft_client_core_bars_bottombar().get_Key$type$com$kamitsoft$client$core$bars$bottombar$BottomBarPresenter$_annotation$$none$$());
    
    com$kamitsoft$client$core$MainPagePresenter_topBar_fieldInjection(injectee, injector.getFragment_com_kamitsoft_client_core_bars_topbar().get_Key$type$com$kamitsoft$client$core$bars$topbar$TopBarPresenter$_annotation$$none$$());
    
    com$kamitsoft$client$core$MainPagePresenter_welcom_fieldInjection(injectee, injector.getFragment_com_kamitsoft_client_core_welcom().get_Key$type$com$kamitsoft$client$core$welcom$WelcomePresenter$_annotation$$none$$());
    
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$MainPageView$Binder$_annotation$$none$$(com.kamitsoft.client.core.MainPageView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$(com.kamitsoft.client.core.MainPageView injectee) {
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.MainPagePresenter$Display declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenter(AbstractPresenterModule.java:126)
   */
  public com.kamitsoft.client.core.MainPagePresenter.Display get_Key$type$com$kamitsoft$client$core$MainPagePresenter$Display$_annotation$$none$$() {
    com.kamitsoft.client.core.MainPagePresenter.Display result = get_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$();
    return result;
    
  }
  
  private com.kamitsoft.client.core.MainPagePresenter.Proxy singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$ = null;
  
  public com.kamitsoft.client.core.MainPagePresenter.Proxy get_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$() {
    
    if (singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$ == null) {
    Object created = GWT.create(com.kamitsoft.client.core.MainPagePresenter.Proxy.class);
    assert created instanceof com.kamitsoft.client.core.MainPagePresenter.Proxy;
    com.kamitsoft.client.core.MainPagePresenter.Proxy result = (com.kamitsoft.client.core.MainPagePresenter.Proxy) created;
    
    memberInject_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$(result);
    
        singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$;
    
  }
  
  private com.kamitsoft.client.core.MainPagePresenter singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$ = null;
  
  public com.kamitsoft.client.core.MainPagePresenter get_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$ == null) {
    com.kamitsoft.client.core.MainPagePresenter result = com$kamitsoft$client$core$MainPagePresenter_com$kamitsoft$client$core$MainPagePresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$kamitsoft$client$core$MainPagePresenter$Display$_annotation$$none$$(), get_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$(result);
    
        singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$;
    
  }
  
  public com.kamitsoft.client.core.MainPagePresenter com$kamitsoft$client$core$MainPagePresenter_com$kamitsoft$client$core$MainPagePresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.kamitsoft.client.core.MainPagePresenter.Display _1, com.kamitsoft.client.core.MainPagePresenter.Proxy _2) {
    return new com.kamitsoft.client.core.MainPagePresenter(_0, _1, _2);
  }
  
  
  /**
   * Binding for com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter> declared at:
   *   Implicit injection of com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter>
   */
  public com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter> get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$kamitsoft$client$core$MainPagePresenter$$_annotation$$none$$() {
    com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter> result = new com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter>() { 
        public void get(final com.google.gwt.user.client.rpc.AsyncCallback<? super com.kamitsoft.client.core.MainPagePresenter> callback) { 
          com.google.gwt.core.client.GWT.runAsync(com.kamitsoft.client.core.MainPagePresenter.class,new com.google.gwt.core.client.RunAsyncCallback() { 
            public void onSuccess() { 
              callback.onSuccess(get_Key$type$com$kamitsoft$client$core$MainPagePresenter$_annotation$$none$$());
            }
            public void onFailure(Throwable ex) { 
               callback.onFailure(ex); 
            } 
        }); 
        }
     };
    
    return result;
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.MainPageView$Binder declared at:
   *   Implicit GWT.create binding for com.kamitsoft.client.core.MainPageView$Binder
   */
  public com.kamitsoft.client.core.MainPageView.Binder get_Key$type$com$kamitsoft$client$core$MainPageView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.kamitsoft.client.core.MainPageView.Binder.class);
    assert created instanceof com.kamitsoft.client.core.MainPageView.Binder;
    com.kamitsoft.client.core.MainPageView.Binder result = (com.kamitsoft.client.core.MainPageView.Binder) created;
    
    memberInject_Key$type$com$kamitsoft$client$core$MainPageView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  private com.kamitsoft.client.core.MainPageView singleton_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$ = null;
  
  public com.kamitsoft.client.core.MainPageView get_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$() {
    
    if (singleton_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$ == null) {
    com.kamitsoft.client.core.MainPageView result = com$kamitsoft$client$core$MainPageView_com$kamitsoft$client$core$MainPageView_methodInjection(get_Key$type$com$kamitsoft$client$core$MainPageView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$(result);
    
        singleton_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$kamitsoft$client$core$MainPageView$_annotation$$none$$;
    
  }
  
  public com.kamitsoft.client.core.MainPageView com$kamitsoft$client$core$MainPageView_com$kamitsoft$client$core$MainPageView_methodInjection(com.kamitsoft.client.core.MainPageView.Binder _0) {
    return new com.kamitsoft.client.core.MainPageView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector;
  public com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment(com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector) {
    this.injector = injector;
  }
  
  public void initializeEagerSingletons() {
    // Eager singleton bound at:
    //   Implicit GWT.create binding for com.kamitsoft.client.core.MainPagePresenter$Proxy
    get_Key$type$com$kamitsoft$client$core$MainPagePresenter$Proxy$_annotation$$none$$();
    
  }
  
}
