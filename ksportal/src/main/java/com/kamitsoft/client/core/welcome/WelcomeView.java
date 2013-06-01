package com.kamitsoft.client.core.welcome;

import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.ViewImpl;
import com.kamitsoft.client.core.MainPagePresenter;
import com.kamitsoft.client.ui.carousel.CarouselPanel;

public class WelcomeView extends ViewImpl implements WelcomePresenter.Display {

		private final Widget widget;
	
		public interface Binder extends UiBinder<Widget, WelcomeView> {
		}
	
		@UiField HTMLPanel welcomePanel;
		
		
		@Inject
		public WelcomeView(final Binder binder) {
			widget = binder.createAndBindUi(this);
		}
	
		@Override
		public Widget asWidget() {
			return widget;
		}
		
		
		@Override
		public void setInSlot(Object slot, Widget content) {
			
			
			
		}

		
	    
		

}
		