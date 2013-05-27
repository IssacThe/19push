package com.kamitsoft.client.core.bars.bottombar;
import com.google.gwt.user.client.ui.MenuItem;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;


public class BottomBarPresenter extends PresenterWidget<BottomBarPresenter.Display> {

  public interface Display extends View {

	
	  
  }

private Display display;

@Inject
private PlaceManager placeManager; 
  
  @Inject
  public BottomBarPresenter(EventBus eventBus, Display view) {
    super(eventBus, view);
   display=view;
    
  }

 
  @Override
  public void onBind(){
	  super.onBind();
	  /*
	  display.getPassionCouture().setCommand( new Command() {
			public void execute() {
				displayPlace(NamesTokens.passionCouture) ;
			}

		});
	  
	  display.getCoordonneesClient().setCommand( new Command() {
			public void execute() {
				displayPlace(NamesTokens.clientContact);	
			}

		});
	  
	  display.getMesureClient().setCommand( new Command() {
			public void execute() {
				displayPlace(NamesTokens.clientMesure) ;	
			}

		});
	  
	  display.getTissuBazin().setCommand( new Command() {
			public void execute() {
				displayPlace(NamesTokens.tissuBazin) ;	
			}

		});
	  
	  display.getTissuPercale().setCommand( new Command() {
			public void execute() {
				displayPlace(NamesTokens.tissuPercale) ;	
			}

		});
	  
*/
	  
  }

protected void displayPlace(String  place) {
	PlaceRequest pr = new PlaceRequest(place);
	placeManager.revealPlace(pr);
	
}


}