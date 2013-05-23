package com.kamitsoft.client.core.bars.bottombar;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;


public class BottomBarView extends ViewImpl implements BottomBarPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, BottomBarView> {	}

 

  
  @Inject
  public BottomBarView(final Binder binder) {
	  widget = binder.createAndBindUi(this);
   
   
   
  }



  public Widget asWidget() {
	 return  widget;  }
  


}