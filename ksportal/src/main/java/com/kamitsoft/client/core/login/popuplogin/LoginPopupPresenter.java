package com.kamitsoft.client.core.login.popuplogin;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;


public class LoginPopupPresenter extends PresenterWidget<LoginPopupPresenter.Display> {

	public interface Display extends View {

	  public String getPassword();
	  public String getUsername();
	  public void center();
	  
	}
	private Display display;

	@Inject
	private PlaceManager placeManager; 
	  
	@Inject
	public LoginPopupPresenter(EventBus eventBus, Display view) {
	    super(eventBus, view);
	    display=view;
	    
	}
	
	 
	@Override
	public void onBind(){
		  super.onBind();
	}
	
	
	@Override
	protected void onReveal() {
		super.onReveal();
		getView().center();
	}


	



}