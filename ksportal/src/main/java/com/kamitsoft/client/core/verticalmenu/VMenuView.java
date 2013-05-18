package com.kamitsoft.client.core.verticalmenu;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;


public class VMenuView extends ViewImpl implements VMenuPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, VMenuView> {	}

 
  @UiField MenuItem passioncouture;
  @UiField MenuItem coordonnees;
  @UiField MenuItem mesure;
  @UiField MenuItem bazins;
  @UiField MenuItem percales;
  
  @Inject
  public VMenuView(final Binder binder) {
	  widget = binder.createAndBindUi(this);
   
   
   
  }



  public Widget asWidget() {
	 return  widget;  }
  


public MenuItem getCoordonneesClient(){return this.coordonnees;}

public MenuItem getMesureClient(){return this.mesure;}


//@Override
public MenuItem getPassionCouture() {
	// TODO Auto-generated method stub
	return this.passioncouture;
}


//@Override
public MenuItem getTissuBazin() {
	// TODO Auto-generated method stub
	return bazins;
}


//@Override
public MenuItem getTissuPercale() {
	// TODO Auto-generated method stub
	return percales;
}
}