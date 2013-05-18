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

  @UiField HTMLPanel mainPanel; 
  
  @UiField SimplePanel hmenu;
  @UiField SimplePanel vmenu;
  @UiField SimplePanel header;
  @UiField SimplePanel mainContent;
  
	  @Inject
	 public MainPageView(final Binder binder) {
		  widget = binder.createAndBindUi(this);
	 }
	  
  	@Override
	public void setInSlot(Object slot, Widget content) {
	    if (slot == MainPagePresenter.TYPE_VMenuContent) {
	        setVerticalMenu(content);
	    }
	    if (slot == MainPagePresenter.TYPE_HeaderContent) {
	        setHeader(content);
	    }
	    if (slot == MainPagePresenter.TYPE_MainContent) {
	        setMainContent(content);
	    }
    
	}
  	private void setMainContent(Widget content) {
		mainContent.clear();
		mainContent.add(content);
  	}
  
  	private void setHeader(Widget content) {
	  header.clear();
	  header.add(content);
	
  	}
  	private void setVerticalMenu(Widget content) {
	  vmenu.clear();
	  vmenu.add(content);
  	}

  	
	public Widget asWidget() {
		// TODO Auto-generated method stub
		return widget;
	}
  
  

}