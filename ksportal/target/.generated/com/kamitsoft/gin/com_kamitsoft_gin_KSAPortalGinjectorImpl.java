package com.kamitsoft.gin;

public class com_kamitsoft_gin_KSAPortalGinjectorImpl implements com.kamitsoft.gin.KSAPortalGinjector {
  
  /**
   * Top-level injector instance for injector interface com.kamitsoft.gin.KSAPortalGinjector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector = new com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector(this);
  public com_kamitsoft_gin_KSAPortalGinjectorImpl() {
    fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector.initializeEagerSingletons();
    
  }
  
  public com.google.web.bindery.event.shared.EventBus getEventBus() {
    return fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.MainPagePresenter> getMainPagePresenter() {
    return fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector.getFragment_com_kamitsoft_client_core().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$kamitsoft$client$core$MainPagePresenter$$_annotation$$none$$();
  }
  
  public com.google.gwt.inject.client.AsyncProvider<com.kamitsoft.client.core.welcom.WelcomePresenter> getPassionCouturePresenter() {
    return fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector.getFragment_com_kamitsoft_client_core_welcom().get_Key$type$com$google$gwt$inject$client$AsyncProvider$com$kamitsoft$client$core$welcom$WelcomePresenter$$_annotation$$none$$();
  }
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager getPlaceManager() {
    return fieldcom_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$();
  }
  
}
