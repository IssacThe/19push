package com.kamitsoft.client.core.login.welcomelogin;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.ui.carousel.CarouselPanel;



public class WelcomeLoginView extends ViewImpl implements WelcomeLoginPresenter.Display {

	 private final Widget widget;

	 public interface Binder extends UiBinder<Widget, WelcomeLoginView> {	}
  	 @UiField CarouselPanel carousel;
  	 @UiField PasswordTextBox textFieldPassword;
	 @UiField TextBox textFieldUsername;
	 @UiField TextBox textFieldAccountID;
	 
	 @Inject
	 public WelcomeLoginView(final Binder binder) {
		  widget = binder.createAndBindUi(this);
	 }
	  
  	
  

  	public Widget asWidget() {
		return widget;
	}

  	@Override
	public void addWidgetToSlider(Widget e){
  		carousel.setWidgetItem(e);
	}
	
	@Override
	public void startSlider(){
		carousel.forwardCirculare();
	}
	
	@Override
	public String getAccountID(){
  		return this.textFieldUsername.getText();
  	}
	
	@Override
	public String getUsername(){
  		return this.textFieldUsername.getText();
  	}
	
	@Override
	public String getPassword(){
  		return this.textFieldPassword.getText();
  	}
	
  	
  

}