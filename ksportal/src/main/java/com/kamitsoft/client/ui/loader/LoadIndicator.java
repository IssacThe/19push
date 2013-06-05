package com.kamitsoft.client.ui.loader;



import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.inject.Singleton;

@Singleton
public class LoadIndicator extends PopupPanel{
	
	public LoadIndicator(){
		super();
	    addStyleName("noborder");
		this.add(new Image("images/ajax-loader.gif"));
		this.center();
	}
}
