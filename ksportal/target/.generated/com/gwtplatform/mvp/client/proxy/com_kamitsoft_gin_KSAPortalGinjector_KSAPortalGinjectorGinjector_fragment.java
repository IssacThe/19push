package com.gwtplatform.mvp.client.proxy;

import com.google.gwt.core.client.GWT;
import com.kamitsoft.gin.com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector;

public class com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter injectee) {
    
  }
  
  private com.gwtplatform.mvp.client.proxy.TokenFormatter singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.proxy.TokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.proxy.TokenFormatter result = get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$TokenFormatter$_annotation$$none$$;
    
  }
  
  private com.gwtplatform.mvp.client.proxy.PlaceManager singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = null;
  
  public com.gwtplatform.mvp.client.proxy.PlaceManager get_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$() {
    
    if (singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ == null) {
    com.gwtplatform.mvp.client.proxy.PlaceManager result = injector.getFragment_com_kamitsoft_client_places().get_Key$type$com$kamitsoft$client$places$KSAPlaceManager$_annotation$$none$$();
        singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$gwtplatform$mvp$client$proxy$PlaceManager$_annotation$$none$$;
    
  }
  
  
  /**
   * Binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter declared at:
   *   Implicit binding for com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter
   */
  public com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter get_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$() {
    com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter result = com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_methodInjection();
    memberInject_Key$type$com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter$_annotation$$none$$(result);
    
    return result;
    
  }
  
  public com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_com$gwtplatform$mvp$client$proxy$ParameterTokenFormatter_methodInjection() {
    return new com.gwtplatform.mvp.client.proxy.ParameterTokenFormatter();
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector;
  public com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector_fragment(com_kamitsoft_gin_KSAPortalGinjector_KSAPortalGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
