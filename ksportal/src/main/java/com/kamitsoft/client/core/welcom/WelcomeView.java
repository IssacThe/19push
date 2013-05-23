package com.kamitsoft.client.core.welcom;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.google.gwt.user.client.ui.MenuItem;

public class WelcomeView extends ViewImpl implements WelcomePresenter.Display {

	private final Widget widget;

	public interface Binder extends UiBinder<Widget, WelcomeView> {
	}

	@UiField HTMLPanel passionContent;
	
	@Inject
	public WelcomeView(final Binder binder) {
		widget = binder.createAndBindUi(this);

	}

	@Override
	public Widget asWidget() {
		return widget;
	}


}