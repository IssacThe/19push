package com.kamitsoft.client.core.login;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;


public class LoginPresenter extends PresenterWidget<LoginPresenter.Display> {

	public interface Display extends View {

	  public String getPassword();
	  public String getUsername();
	  
	}

  private Display display;

  @Inject
  private PlaceManager placeManager; 
  
  @Inject
  public LoginPresenter(EventBus eventBus, Display view) {
    super(eventBus, view);
   display=view;
    
  }

 
  @Override
  public void onBind(){
	  super.onBind();
	 
	  
  }

protected void displayPlace(String  place) {
	PlaceRequest pr = new PlaceRequest(place);
	placeManager.revealPlace(pr);
	
}


}