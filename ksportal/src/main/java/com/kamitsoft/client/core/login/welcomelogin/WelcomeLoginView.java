package com.kamitsoft.client.core.login.welcomelogin;

import com.google.gwt.event.dom.client.KeyPressHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.ui.carousel.CarouselPanel;
import com.kamitsoft.shared.constants.LoginConstants;



public class WelcomeLoginView extends ViewImpl implements WelcomeLoginPresenter.Display {

	 private final Widget widget;

	 public interface Binder extends UiBinder<Widget, WelcomeLoginView> {	}
  	 @UiField CarouselPanel carousel;
  	 @UiField PasswordTextBox textFieldPassword;
	 @UiField TextBox textFieldUsername;
	 @UiField TextBox textFieldAccountID;
	 @UiField Label loginmessage;
	 private MainDictionary dictionary;
	 @Inject
	 public WelcomeLoginView(final Binder binder,MainDictionary dictionary) {
		  widget = binder.createAndBindUi(this);
		  this.dictionary = dictionary;
		  loginmessage.setText("");
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
	public String getAccountName(){
  		return this.textFieldAccountID.getText();
  	}
	
	@Override
	public String getUsername(){
  		return this.textFieldUsername.getText();
  	}
	
	@Override
	public String getPassword(){
  		return this.textFieldPassword.getText();
  	}
	
	@Override
	public void setLoginMessage(int msgCode){
		switch(msgCode){
			case LoginConstants.CREDENTIAL_INCORRECT:loginmessage.setText(dictionary.invalidUserNameOrPassword());
			break;
			case LoginConstants.ACCOUNTID_TO_SMALL:loginmessage.setText(dictionary.accountIDTooShort());
			break;
			case LoginConstants.USERID_TO_SMALL:loginmessage.setText(dictionary.userIDTooShort());
			break;
			case LoginConstants.PASSWORD_TO_SMALL:loginmessage.setText(dictionary.passwordTooShort());
			break;
		}
		loginmessage.setVisible(true);
  	}
  
	@Override
	public void clearFields(){
		textFieldUsername.setText("");
		textFieldAccountID.setText("");
		textFieldPassword.setText("");
	}
	
	@Override
	public void addKeyHandler(KeyPressHandler keyPressHandler){
		textFieldUsername.addKeyPressHandler(keyPressHandler);
		textFieldAccountID.addKeyPressHandler(keyPressHandler);
		textFieldPassword.addKeyPressHandler(keyPressHandler);
	}
	@Override
	public void clearMessage(){
		loginmessage.setText("");
		loginmessage.setVisible(false);
	}
}