package com.kamitsoft.client.core.login.popuplogin;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;

import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PopupViewImpl;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;
import com.kamitsoft.client.i18n.MainDictionary;


public class LoginPopupView extends PopupViewImpl implements LoginPopupPresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, LoginPopupView> {}

 
	@UiField PasswordTextBox textFieldPassword;
	@UiField TextBox textFieldUsername;

    private MainDictionary dictionary;
	@Inject
	public LoginPopupView(final Binder binder, EventBus eventBus,MainDictionary dictionary) {
		super(eventBus);
		widget = binder.createAndBindUi(this); 
		this.dictionary= dictionary;
	}



  	public Widget asWidget() {
	 return  widget;  
	}
  

  	@Override
	public String getPassword(){
  		return this.textFieldPassword.getText();
  	}
	
  	@Override
	public String getUsername(){
  		return this.textFieldUsername.getText();
  	}

  	@Override
  	public void center(){
  		this.center();
  	}
	
}