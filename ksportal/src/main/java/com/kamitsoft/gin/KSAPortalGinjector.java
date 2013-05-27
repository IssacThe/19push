package com.kamitsoft.gin;


import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.welcom.WelcomePresenter;


@GinModules({ BinderModule.class })
public interface KSAPortalGinjector extends Ginjector {
	  PlaceManager getPlaceManager();
	  EventBus getEventBus();
	  AsyncProvider<MainPagePresenter> getMainPagePresenter();
	  AsyncProvider<WelcomePresenter> getPassionCouturePresenter();

}