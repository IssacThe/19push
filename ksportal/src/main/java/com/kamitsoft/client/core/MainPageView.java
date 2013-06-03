package com.kamitsoft.client.core;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;



public class MainPageView extends ViewImpl implements MainPagePresenter.Display {

  private final Widget widget;

  public interface Binder extends UiBinder<Widget, MainPageView> {	}


  
  	@UiField SimplePanel topBar;
  	@UiField SimplePanel bottomBar;
  	@UiField HTMLPanel mainContent;
  	@UiField HTMLPanel loginContent;
	@Inject
	public MainPageView(final Binder binder) {
		  widget = binder.createAndBindUi(this);
	}
	  
  	@Override
	public void setInSlot(Object slot, Widget content) {
	    if (slot == MainPagePresenter.TYPE_TopBar) {
	        setTopBar(content);
	    }
	    if (slot == MainPagePresenter.TYPE_BottomBar) {
	        setBottomBar(content);
	    }
	    if (slot == MainPagePresenter.TYPE_MainContent) {
	        setMainContent(content);
	    }
	    
	}
  	
  	private void setMainContent(Widget content) {
		mainContent.clear();
		mainContent.add(content);
  	}
  
  	private void setBottomBar(Widget content) {
  		bottomBar.clear();
  		bottomBar.add(content);
  		
	
  	}
  	private void setTopBar(Widget content) {
  		topBar.clear();
  		topBar.add(content);
  	}

 	
  	public Widget asWidget() {
		return widget;
	}

  	
	
  
  

}