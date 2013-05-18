package com.kamitsoft.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.MainPageView;
import com.kamitsoft.client.core.login.LoginPresenter;
import com.kamitsoft.client.core.login.LoginView;
import com.kamitsoft.client.core.soyapassion.PassionCouturePresenter;
import com.kamitsoft.client.core.soyapassion.PassionCoutureView;
import com.kamitsoft.client.core.verticalmenu.VMenuPresenter;
import com.kamitsoft.client.core.verticalmenu.VMenuView;
import com.kamitsoft.client.places.KSAPlaceManager;

public class BinderModule extends AbstractPresenterModule {

	  @Override
	  protected void configure() {  
	    install(new DefaultModule(KSAPlaceManager.class));
	    
	    // Presenters
	    bindPresenter(MainPagePresenter.class, MainPagePresenter.Display.class, MainPageView.class,  MainPagePresenter.Proxy.class);
	    bindPresenter(PassionCouturePresenter.class, PassionCouturePresenter.Display.class, PassionCoutureView.class, PassionCouturePresenter.Proxy.class);
	      
	   // widigets
	    bindPresenterWidget(VMenuPresenter.class, VMenuPresenter.Display.class, VMenuView.class);
	    bindPresenterWidget(LoginPresenter.class, LoginPresenter.Display.class, LoginView.class);
	      
	  }
	}