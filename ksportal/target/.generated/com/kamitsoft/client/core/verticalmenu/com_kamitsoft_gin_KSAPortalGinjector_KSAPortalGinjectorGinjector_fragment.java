package com.kamitsoft.client.core.verticalmenu;

import com.google.gwt.core.client.GWT;
import com.kamitsoft.gin.com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector;

public class com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment {
  public native void com$kamitsoft$client$core$verticalmenu$VMenuPresenter_placeManager_fieldInjection(com.kamitsoft.client.core.verticalmenu.VMenuPresenter injectee, com.gwtplatform.mvp.client.proxy.PlaceManager value) /*-{
    injectee.@com.kamitsoft.client.core.verticalmenu.VMenuPresenter::placeManager = value;
  }-*/;
  
  public void memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuPresenter$_annotation$$none$$(com.kamitsoft.client.core.verticalmenu.VMenuPresenter injectee) {
    injector.getFragment_com_gwtplatform_mvp_client().com$gwtplatform$mvp$client$HandlerContainerImpl_automaticBind_methodInjection_(injectee, injector.getFragment_com_gwtplatform_mvp_client().get_Key$type$com$gwtplatform$mvp$client$AutobindDisable$_annotation$$none$$());
    com$kamitsoft$client$core$verticalmenu$VMenuPresenter_placeManager_fieldInjection(injectee, injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$());
    
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$Binder$_annotation$$none$$(com.kamitsoft.client.core.verticalmenu.VMenuView.Binder injectee) {
    
  }
  
  public void memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$_annotation$$none$$(com.kamitsoft.client.core.verticalmenu.VMenuView injectee) {
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.verticalmenu.VMenuPresenter$Display declared at:
   *   com.gwtplatform.mvp.client.gin.AbstractPresenterModule.bindPresenterWidget(AbstractPresenterModule.java:265)
   */
  public com.kamitsoft.client.core.verticalmenu.VMenuPresenter.Display get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuPresenter$Display$_annotation$$none$$() {
    com.kamitsoft.client.core.verticalmenu.VMenuPresenter.Display result = get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$_annotation$$none$$();
    return result;
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.verticalmenu.VMenuPresenter declared at:
   *   Implicit binding for com.kamitsoft.client.core.verticalmenu.VMenuPresenter
   */
  public com.kamitsoft.client.core.verticalmenu.VMenuPresenter get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuPresenter$_annotation$$none$$() {
    com.kamitsoft.client.core.verticalmenu.VMenuPresenter result = com$kamitsoft$client$core$verticalmenu$VMenuPresenter_com$kamitsoft$client$core$verticalmenu$VMenuPresenter_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuPresenter$Display$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuPresenter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.kamitsoft.client.core.verticalmenu.VMenuPresenter com$kamitsoft$client$core$verticalmenu$VMenuPresenter_com$kamitsoft$client$core$verticalmenu$VMenuPresenter_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.kamitsoft.client.core.verticalmenu.VMenuPresenter.Display _1) {
    return new com.kamitsoft.client.core.verticalmenu.VMenuPresenter(_0, _1);
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.verticalmenu.VMenuView$Binder declared at:
   *   Implicit GWT.create binding for com.kamitsoft.client.core.verticalmenu.VMenuView$Binder
   */
  public com.kamitsoft.client.core.verticalmenu.VMenuView.Binder get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$Binder$_annotation$$none$$() {
    Object created = GWT.create(com.kamitsoft.client.core.verticalmenu.VMenuView.Binder.class);
    assert created instanceof com.kamitsoft.client.core.verticalmenu.VMenuView.Binder;
    com.kamitsoft.client.core.verticalmenu.VMenuView.Binder result = (com.kamitsoft.client.core.verticalmenu.VMenuView.Binder) created;
    
    memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$Binder$_annotation$$none$$(result);
    
    return result;
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.core.verticalmenu.VMenuView declared at:
   *   Implicit binding for com.kamitsoft.client.core.verticalmenu.VMenuView
   */
  public com.kamitsoft.client.core.verticalmenu.VMenuView get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$_annotation$$none$$() {
    com.kamitsoft.client.core.verticalmenu.VMenuView result = com$kamitsoft$client$core$verticalmenu$VMenuView_com$kamitsoft$client$core$verticalmenu$VMenuView_methodInjection(get_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$Binder$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$core$verticalmenu$VMenuView$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.kamitsoft.client.core.verticalmenu.VMenuView com$kamitsoft$client$core$verticalmenu$VMenuView_com$kamitsoft$client$core$verticalmenu$VMenuView_methodInjection(com.kamitsoft.client.core.verticalmenu.VMenuView.Binder _0) {
    return new com.kamitsoft.client.core.verticalmenu.VMenuView(_0);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector;
  public com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment(com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
