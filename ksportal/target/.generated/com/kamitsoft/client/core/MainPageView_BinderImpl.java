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
    @Template("<span id='{0}'></span>  <span id='{1}'></span>  <span id='{2}'></span>  <span id='{3}'></span>")
    SafeHtml html1(String arg0, String arg1, String arg2, String arg3);
     
    @Template("<span id='{0}'></span>")
    SafeHtml html2(String arg0);
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.kamitsoft.client.core.MainPageView owner) {

    com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle) GWT.create(com.kamitsoft.client.core.MainPageView_BinderImpl_GenBundle.class);
    java.lang.String domId0 = com.google.gwt.dom.client.Document.get().createUniqueId();
    java.lang.String domId1 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel header = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId2 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel hmenu = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId3 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel vmenu = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    java.lang.String domId4 = com.google.gwt.dom.client.Document.get().createUniqueId();
    com.google.gwt.user.client.ui.SimplePanel mainContent = (com.google.gwt.user.client.ui.SimplePanel) GWT.create(com.google.gwt.user.client.ui.SimplePanel.class);
    com.google.gwt.user.client.ui.HTMLPanel mainPanel = new com.google.gwt.user.client.ui.HTMLPanel(template.html1(domId1, domId2, domId3, domId4).asString());
    com.google.gwt.user.client.ui.HTMLPanel f_HTMLPanel1 = new com.google.gwt.user.client.ui.HTMLPanel(template.html2(domId0).asString());

    header.setHeight("100px");
    header.setWidth("100%");
    hmenu.setHeight("20px");
    vmenu.setStyleName("verticalmenu");
    mainContent.setStyleName("content");
    mainContent.setHeight("80%");
    mainContent.setWidth("82%");
    mainPanel.setStyleName("mainpanel");
    f_HTMLPanel1.setStyleName("mainbckg");

    UiBinderUtil.TempAttachment attachRecord0 = UiBinderUtil.attachToDom(f_HTMLPanel1.getElement());
    UiBinderUtil.TempAttachment attachRecord1 = UiBinderUtil.attachToDom(mainPanel.getElement());
    com.google.gwt.user.client.Element domId1Element = com.google.gwt.dom.client.Document.get().getElementById(domId1).cast();
    com.google.gwt.user.client.Element domId2Element = com.google.gwt.dom.client.Document.get().getElementById(domId2).cast();
    com.google.gwt.user.client.Element domId3Element = com.google.gwt.dom.client.Document.get().getElementById(domId3).cast();
    com.google.gwt.user.client.Element domId4Element = com.google.gwt.dom.client.Document.get().getElementById(domId4).cast();
    attachRecord1.detach();
    mainPanel.addAndReplaceElement(header, domId1Element);
    mainPanel.addAndReplaceElement(hmenu, domId2Element);
    mainPanel.addAndReplaceElement(vmenu, domId3Element);
    mainPanel.addAndReplaceElement(mainContent, domId4Element);
    com.google.gwt.user.client.Element domId0Element = com.google.gwt.dom.client.Document.get().getElementById(domId0).cast();
    attachRecord0.detach();
    f_HTMLPanel1.addAndReplaceElement(mainPanel, domId0Element);


    owner.header = header;
    owner.hmenu = hmenu;
    owner.mainContent = mainContent;
    owner.mainPanel = mainPanel;
    owner.vmenu = vmenu;

    return f_HTMLPanel1;
  }
}
