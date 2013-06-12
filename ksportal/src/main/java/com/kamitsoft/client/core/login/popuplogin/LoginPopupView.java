package com.kamitsoft.client.core.login.popuplogin;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyDownHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.shared.constants.LoginConstants;


public class LoginPopupView extends PopupViewImpl implements LoginPopupPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LoginPopupView> {}

 
	@UiField PasswordTextBox textFieldPassword;
	@UiField TextBox textFieldUsername;
	@UiField Label username;
	@UiField Label password;
	@UiField Button connect;
	@UiField Button cancel;
	@UiField Label loginmessage;
    private MainDictionary dictionary;
	@Inject
	public LoginPopupView(final Binder binder, EventBus eventBus,MainDictionary dictionary) {
		super(eventBus);
		
		widget = binder.createAndBindUi(this); 
		this.dictionary= dictionary;
		username.setText(dictionary.userName()+":");
		password.setText(dictionary.password()+":");
		
		
		cancel.addClickHandler(new ClickHandler(){
		
			@Override
			public void onClick(ClickEvent event) {
				textFieldPassword.setText("");
				textFieldUsername.setText("");
				loginmessage.setVisible(false);
			}
			
		});
		textFieldUsername.addChangeHandler(new ChangeHandler(){

			@Override
			public void onChange(ChangeEvent event) {
				
					loginmessage.setVisible(false);
			
				
			}
			
		});
		
		textFieldPassword.addChangeHandler(new ChangeHandler(){

			@Override
			public void onChange(ChangeEvent event) {
					loginmessage.setVisible(false);
			}
			
		});
		
		
	}

	@Override
    public void clear(){
    	textFieldPassword.setText("");
		loginmessage.setVisible(true);
		loginmessage.setText(dictionary.timeout());
    }
	
	@Override
  	public Widget asWidget() {
	 return  widget;  
	}
  

  	@Override
	public HasText getPassword(){
  		return this.textFieldPassword;
  	}
	
  	@Override
	public HasText getUsername(){
  		return this.textFieldUsername;
  	}
  
  	@Override
  	public HasClickHandlers getConnectClick(){
  		return connect;
  	}
  	
  	@Override
	public void setLoginMessage(int msgCode){
		switch(msgCode){
			case LoginConstants.CREDENTIAL_INCORRECT:loginmessage.setText(dictionary.invalidUserNameOrPassword());
			break;
			
			case LoginConstants.USERID_TO_SMALL:loginmessage.setText(dictionary.userIDTooShort());
			break;
			case LoginConstants.PASSWORD_TO_SMALL:loginmessage.setText(dictionary.passwordTooShort());
			break;
		}
		loginmessage.setVisible(true);
  	}
	
  	@Override
	public void addKeyHandler(KeyDownHandler keyDownHandler){
  		
		textFieldUsername.addKeyDownHandler(keyDownHandler);
		textFieldPassword.addKeyDownHandler(keyDownHandler);
	}
}