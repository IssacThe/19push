package com.kamitsoft.client.places;


import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.proxy.PlaceManagerImpl;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.gwtplatform.mvp.client.proxy.TokenFormatter;

public class KSAPlaceManager extends PlaceManagerImpl {

	  @Inject
	  public KSAPlaceManager( EventBus eventBus,  TokenFormatter tokenFormatter ) {
	    super(eventBus, tokenFormatter);
	    
	  }

	 
	  public  void revealDefaultPlace(){
	    // Using false as a second parameter ensures that the URL in the browser bar
	    // is not updated, so the user is able to leave the application using the
	    // browser's back navigation button.
	    revealPlace( new PlaceRequest(NamesTokens.passionCouture), false );
	  }
	}