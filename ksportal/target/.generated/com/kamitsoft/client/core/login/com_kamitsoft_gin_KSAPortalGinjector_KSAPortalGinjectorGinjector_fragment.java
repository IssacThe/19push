package com.kamitsoft.client.core.login;

import com.google.gwt.core.client.GWT;
import com.kamitsoft.gin.com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector;

public class com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment {
  public native void com$kamitsoft$client$core$login$LoginPresenter_placeManager_fieldInjection(com.kamitsoft.client.core.login.LoginPresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.kamitsoft.client.core.login.LoginPresenter::placeManager = value;
  }-*/;
  
  public void memberInject_Key$type$com$kamitsoft$client$core$login$LoginPresenter$_annotation$$none$$(com.kamitsoft.client.core.login.LoginPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$kamitsoft$client$core$login$LoginPresenter_placeManager_fieldInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$login$LoginView$Binder$_annotation$$none$$(com.kamitsoft.client.core.login.LoginView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$login$LoginView$_annotation$$none$$(com.kamitsoft.client.core.login.LoginView injectee) {
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.login.LoginPresenter$Display declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenterWidget(AbstractPresenterModule.java:265)
   */
  public com.kamitsoft.client.core.login.LoginPresenter.Display get_Key$type$com$kamitsoft$client$core$login$LoginPresenter$Display$_annotation$$none$$() {
    com.kamitsoft.client.core.login.LoginPresenter.Display result = get_Key$type$com$kamitsoft$client$core$login$LoginView$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.login.LoginPresenter declared at:
   *   Implicit binding for com.kamitsoft.client.core.login.LoginPresenter
   */
  public com.kamitsoft.client.core.login.LoginPresenter get_Key$type$com$kamitsoft$client$core$login$LoginPresenter$_annotation$$none$$() {
    com.kamitsoft.client.core.login.LoginPresenter result = com$kamitsoft$client$core$login$LoginPresenter_com$kamitsoft$client$core$login$LoginPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$kamitsoft$client$core$login$LoginPresenter$Display$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$login$LoginPresenter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.kamitsoft.client.core.login.LoginPresenter com$kamitsoft$client$core$login$LoginPresenter_com$kamitsoft$client$core$login$LoginPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.kamitsoft.client.core.login.LoginPresenter.Display _1) {
    return new com.kamitsoft.client.core.login.LoginPresenter(_0, _1);
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.login.LoginView$Binder declared at:
   *   Implicit GWT.create binding for com.kamitsoft.client.core.login.LoginView$Binder
   */
  public com.kamitsoft.client.core.login.LoginView.Binder get_Key$type$com$kamitsoft$client$core$login$LoginView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.kamitsoft.client.core.login.LoginView.Binder.class);
    assert created instanceof com.kamitsoft.client.core.login.LoginView.Binder;
    com.kamitsoft.client.core.login.LoginView.Binder result = (com.kamitsoft.client.core.login.LoginView.Binder) created;
    
    memberInject_Key$type$com$kamitsoft$client$core$login$LoginView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.login.LoginView declared at:
   *   Implicit binding for com.kamitsoft.client.core.login.LoginView
   */
  public com.kamitsoft.client.core.login.LoginView get_Key$type$com$kamitsoft$client$core$login$LoginView$_annotation$$none$$() {
    com.kamitsoft.client.core.login.LoginView result = com$kamitsoft$client$core$login$LoginView_com$kamitsoft$client$core$login$LoginView_methodInjection(get_Key$type$com$kamitsoft$client$core$login$LoginView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$login$LoginView$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.kamitsoft.client.core.login.LoginView com$kamitsoft$client$core$login$LoginView_com$kamitsoft$client$core$login$LoginView_methodInjection(com.kamitsoft.client.core.login.LoginView.Binder _0) {
    return new com.kamitsoft.client.core.login.LoginView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector;
  public com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment(com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
