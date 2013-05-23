package com.kamitsoft.gin;

import com.gwtplatform.mvp.client.gin.AbstractPresenterModule;
import com.gwtplatform.mvp.client.gin.DefaultModule;

import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.core.MainPageView;
import com.kamitsoft.client.core.bars.bottombar.BottomBarPresenter;
import com.kamitsoft.client.core.bars.bottombar.BottomBarView;
import com.kamitsoft.client.core.bars.topbar.TopBarPresenter;
import com.kamitsoft.client.core.bars.topbar.TopBarView;
import com.kamitsoft.client.core.login.LoginPresenter;
import com.kamitsoft.client.core.login.LoginView;
import com.kamitsoft.client.core.welcom.WelcomePresenter;
import com.kamitsoft.client.core.welcom.WelcomeView;
import com.kamitsoft.client.places.KSAPlaceManager;

public class BinderModule extends AbstractPresenterModule {

	  @Override
	  protected void configure() {  
	    install(new DefaultModule(KSAPlaceManager.class));
	    
	    // Presenters
	    bindPresenter(MainPagePresenter.class, MainPagePresenter.Display.class, MainPageView.class,  MainPagePresenter.Proxy.class);
	    bindPresenter(WelcomePresenter.class, WelcomePresenter.Display.class, WelcomeView.class, WelcomePresenter.Proxy.class);
	      
	   // widigets
	    bindPresenterWidget(TopBarPresenter.class, TopBarPresenter.Display.class, TopBarView.class);
	    bindPresenterWidget(BottomBarPresenter.class, BottomBarPresenter.Display.class, BottomBarView.class);
	    bindPresenterWidget(LoginPresenter.class, LoginPresenter.Display.class, LoginView.class);
	      
	  }
	}