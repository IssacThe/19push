package com.kamitsoft.client.core.bars.topbar;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;


public class TopBarView extends ViewImpl implements TopBarPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, TopBarView> {	}

 

  
  @Inject
  public TopBarView(final Binder binder) {
	  widget = binder.createAndBindUi(this);
   
   
   
  }



  public Widget asWidget() {
	 return  widget;  }
  






}