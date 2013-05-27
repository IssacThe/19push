package com.kamitsoft.client.core;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class MainPageView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.kamitsoft.client.core.MainPageView>, com.kamitsoft.client.core.MainPageView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("")
    SafeHtml html1();
     
    @Template("<span id='{0}'></span>  <span id='{1}'></span>  <span id='{2}'></span>")
    SafeHtml html2(String arg0, String arg1, String arg2);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.kamitsoft.client.core.MainPageView owner) {

    com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle) GWT.create(com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel topBar = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.HTMLPanel mainContent = new com.google.gwt.user.client.ui.HTMLPanel(template.html1().asString());
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel bottomBar = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId0, domId1, domId2).asString());

    topBar.setStyleName("topbar kamitBox");
    mainContent.setStyleName("kamitBox background-albatre mainpanel");
    bottomBar.setStyleName("bottombar kamitBox");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(topBar, domId0Element);
    f_HTMLPanel1.addAndReplaceElement(mainContent, domId1Element);
    f_HTMLPanel1.addAndReplaceElement(bottomBar, domId2Element);


    owner.bottomBar = bottomBar;
    owner.mainContent = mainContent;
    owner.topBar = topBar;

    return f_HTMLPanel1;
  }
}
