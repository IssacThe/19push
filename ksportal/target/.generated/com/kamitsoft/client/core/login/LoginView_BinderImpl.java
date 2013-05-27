package com.kamitsoft.client.core.login;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class LoginView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.kamitsoft.client.core.login.LoginView>, com.kamitsoft.client.core.login.LoginView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("<div class='margin-left-20px margin-top-10px'> <span> Username</span> <span id='{0}'></span> </div> <div class='margin-left-20px margin-top-5px'> <span>Password</span> <span id='{1}'></span> </div> <div class='width-250px margin-top-10px centerHorizontal'> <span id='{2}'></span> <span id='{3}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.kamitsoft.client.core.login.LoginView owner) {

    com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle) GWT.create(com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox textFieldUsername = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.PasswordTextBox textFieldPassword = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button f_Button2 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button f_Button3 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2, domId3).asString());

    textFieldUsername.setStyleName("margin-left-50px");
    textFieldPassword.setStyleName("margin-left-51px");
    f_Button2.setStyleName(".gwt-Button  margin-right-5px");
    f_Button2.setText("Cancel");
    f_Button2.setHeight("24px");
    f_Button2.setWidth("93px");
    f_Button3.setStyleName(".gwt-Button  margin-left-10px");
    f_Button3.setText("Connect");
    f_Button3.setHeight("24px");
    f_Button3.setWidth("93px");
    f_HTMLPanel1.setStyleName("background-lightgrey box width-350px height-105px kamitBox padding-top-10px");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(textFieldUsername, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(textFieldPassword, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_Button2, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(f_Button3, domId3Element);


    owner.textFieldPassword = textFieldPassword;
    owner.textFieldUsername = textFieldUsername;

    return f_HTMLPanel1;
  }
}
