package com.kamitsoft.client.core.login;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;


public class LoginView extends ViewImpl implements LoginPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LoginView> {	}

 
	@UiField PasswordTextBox textFieldPassword;
	@UiField TextBox textFieldUsername;

  
	@Inject
	public LoginView(final Binder binder) {
		widget = binder.createAndBindUi(this);
	}



  	public Widget asWidget() {
	 return  widget;  }
  


	public String getPassword(){return this.textFieldPassword.getText();}
	
	public String getUsername(){return this.textFieldUsername.getText();}



}