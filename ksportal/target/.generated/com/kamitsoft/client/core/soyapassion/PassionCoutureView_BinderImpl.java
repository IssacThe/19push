package com.kamitsoft.client.core.soyapassion;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.safehtml.client.SafeHtmlTemplates;
import com.google.gwt.safehtml.shared.SafeHtml;
import com.google.gwt.safehtml.shared.SafeHtmlUtils;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiBinderUtil;
import com.google.gwt.user.client.ui.Widget;

public class PassionCoutureView_BinderImpl implements UiBinder<com.google.gwt.user.client.ui.Widget, com.kamitsoft.client.core.soyapassion.PassionCoutureView>, com.kamitsoft.client.core.soyapassion.PassionCoutureView.Binder {

  interface Template extends SafeHtmlTemplates {
    @Template("Passion")
    SafeHtml html1();
     
  }

  Template template = GWT.create(Template.class);

  public com.google.gwt.user.client.ui.Widget createAndBindUi(final com.kamitsoft.client.core.soyapassion.PassionCoutureView owner) {

    com.kamitsoft.client.core.soyapassion.PassionCoutureView_BinderImpl_GenBundle clientBundleFieldNameUnlikelyToCollideWithUserSpecifiedFieldOkay = (com.kamitsoft.client.core.soyapassion.PassionCoutureView_BinderImpl_GenBundle) GWT.create(com.kamitsoft.client.core.soyapassion.PassionCoutureView_BinderImpl_GenBundle.class);
    com.google.gwt.user.client.ui.HTMLPanel passionContent = new com.google.gwt.user.client.ui.HTMLPanel(template.html1().asString());

    passionContent.setStyleName("");



    owner.passionContent = passionContent;

    return passionContent;
  }
}
