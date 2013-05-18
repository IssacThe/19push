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
    @Template("<div class='margin-left-20px margin-top-10px'> <span id='{0}'></span> <span id='{1}'></span> </div> <div class='margin-left-20px'> <span id='{2}'></span> <span id='{3}'></span> </div> <div class='padding-left-30px margin-top-10px'> <span id='{4}'></span> <span id='{5}'></span> </div>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3, String arg4, String arg5);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.kamitsoft.client.core.login.LoginView owner) {

    com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle) GWT.create(com.kamitsoft.client.core.login.LoginView_BinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label2 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.TextBox textFieldUsername = (com.google.gwt.user.client.ui.TextBox) GWT.create(com.google.gwt.user.client.ui.TextBox.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Label f_Label3 = (com.google.gwt.user.client.ui.Label) GWT.create(com.google.gwt.user.client.ui.Label.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.PasswordTextBox textFieldPassword = (com.google.gwt.user.client.ui.PasswordTextBox) GWT.create(com.google.gwt.user.client.ui.PasswordTextBox.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button f_Button4 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    java.lang.String domId5 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.Button f_Button5 = (com.google.gwt.user.client.ui.Button) GWT.create(com.google.gwt.user.client.ui.Button.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId0, domId1, domId2, domId3, domId4, domId5).asString());

    f_Label2.setText("Username");
    f_Label2.setStyleName("displayinline");
    textFieldUsername.setStyleName("margin-left-50px");
    f_Label3.setText("Password");
    f_Label3.setStyleName("displayinline");
    textFieldPassword.setStyleName("margin-left-51px");
    f_Button4.setStyleName(".gwt-Button  margin-right-5px");
    f_Button4.setText("Cancel");
    f_Button4.setHeight("24px");
    f_Button4.setWidth("93px");
    f_Button5.setStyleName(".gwt-Button  margin-left-10px");
    f_Button5.setText("Connect");
    f_Button5.setHeight("24px");
    f_Button5.setWidth("93px");
    f_HTMLPanel1.setStyleName("background-lightgrey box");
    f_HTMLPanel1.setHeight("100px");
    f_HTMLPanel1.setWidth("270px");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    com.google.gwt.user.client.Element domId5Element = com.google.gwt.dom.client.Document.get().getElementById(domId5).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(f_Label2, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(textFieldUsername, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(f_Label3, domId2Element);
    f_HTMLPanel1.addAndReplaceElement(textFieldPassword, domId3Element);
    f_HTMLPanel1.addAndReplaceElement(f_Button4, domId4Element);
    f_HTMLPanel1.addAndReplaceElement(f_Button5, domId5Element);


    owner.textFieldPassword = textFieldPassword;
    owner.textFieldUsername = textFieldUsername;

    return f_HTMLPanel1;
  }
}
