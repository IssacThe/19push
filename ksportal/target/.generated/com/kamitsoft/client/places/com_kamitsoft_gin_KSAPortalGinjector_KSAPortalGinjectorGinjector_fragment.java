package com.kamitsoft.client.places;

import com.google.gwt.core.client.GWT;
import com.kamitsoft.gin.com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector;

public class com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$kamitsoft$client$places$KSAPlaceManager$_annotation$$none$$(com.kamitsoft.client.places.KSAPlaceManager injectee) {
    
  }
  
  
  /**
   * Binding for com.kamitsoft.client.places.KSAPlaceManager declared at:
   *   Implicit binding for com.kamitsoft.client.places.KSAPlaceManager
   */
  public com.kamitsoft.client.places.KSAPlaceManager get_Key$type$com$kamitsoft$client$places$KSAPlaceManager$_annotation$$none$$() {
    com.kamitsoft.client.places.KSAPlaceManager result = com$kamitsoft$client$places$KSAPlaceManager_com$kamitsoft$client$places$KSAPlaceManager_methodInjection(injector.getFragment_com_google_web_bindery_event_shared().get_Key$type$com$google$web$bindery$event$shared$EventBus$_annotation$$none$$(), injector.getFragment_com_gwtplatform_mvp_client_proxy().get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$());
    memberInject_Key$type$com$kamitsoft$client$places$KSAPlaceManager$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.kamitsoft.client.places.KSAPlaceManager com$kamitsoft$client$places$KSAPlaceManager_com$kamitsoft$client$places$KSAPlaceManager_methodInjection(com.google.web.bindery.event.shared.EventBus _0, com.gwtplatform.mvp.client.proxy.TokenFormatter _1) {
    return new com.kamitsoft.client.places.KSAPlaceManager(_0, _1);
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector;
  public com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment(com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
