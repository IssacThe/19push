package com.kamitsoft.client.core.bars.topbar;

import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.i18n.MainDictionary;
import com.kamitsoft.client.ui.person.PersonInfoPanel;
import com.kamitsoft.shared.beans.user.UserInfo;


public class TopBarView extends ViewImpl implements TopBarPresenter.Display {

    @UiField TextBox searchTextBox;
    @UiField PersonInfoPanel username;
    @UiField Button logout;
    private final Widget widget;
    private MainDictionary dictionary;
    public interface Binder extends UiBinder<Widget, TopBarView> {	}
    

    @Inject
    public TopBarView(final Binder binder, MainDictionary dictionary) {
          widget = binder.createAndBindUi(this);
          this.dictionary = dictionary;
          searchTextBox.getElement().setAttribute("placeHolder", dictionary.patientSearchPlaceHolder());
    }
    
    public Widget asWidget() {
        return  widget;
    }
      
    
    @Override
    public void setSearchBoxChangeHandler(KeyUpHandler handler){
        searchTextBox.addKeyUpHandler(handler);
    }
    
    
    @Override
    public String getSearchText() {
        return searchTextBox.getText();
    }
    
    @Override
    public void setUserInfo(UserInfo userInfo) {
        username.setInfo(userInfo);
    }
    
    @Override
    public HasClickHandlers getLogoutClick(){
        return logout;
    }

}