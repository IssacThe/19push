package com.kamitsoft.client.core.soyapassion;

import com.google.gwt.user.client.ui.Widget;
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


public class PassionCouturePresenter extends Presenter<PassionCouturePresenter.Display, PassionCouturePresenter.Proxy> {

	  public interface Display extends View {
		  public Widget asWidget();
		  
	  };
	 
	  
  @ProxyCodeSplit
  @NameToken(NamesTokens.passionCouture)
  public interface Proxy extends ProxyPlace<PassionCouturePresenter> {}
  private Display display;
 
  
  
  @Inject
  public PassionCouturePresenter(EventBus eventBus, Display view, Proxy proxy) {
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





}