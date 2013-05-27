package com.kamitsoft.client.core.bars.topbar;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.Timer;
import com.google.inject.Inject;
import com.google.web.bindery.event.shared.EventBus;
import com.gwtplatform.mvp.client.PresenterWidget;
import com.gwtplatform.mvp.client.View;
import com.gwtplatform.mvp.client.proxy.PlaceManager;
import com.gwtplatform.mvp.client.proxy.PlaceRequest;
import com.kamitsoft.client.core.bars.topbar.listpopup.PatientListPopupPresenter;


public class TopBarPresenter extends PresenterWidget<TopBarPresenter.Display> {

	public interface Display extends View {
		  void setSearchBoxChangeHandler(KeyUpHandler handler);
		  String  getSearchText();
		
	}

	private Display display;
	
	@Inject private PlaceManager placeManager;
	@Inject private PatientListPopupPresenter listpopup;
	private Timer timer;
	@Inject
	public TopBarPresenter(EventBus eventBus, Display view) {
	   super(eventBus, view);
	   display=view;	    
	}
	
	 
	@Override
	public void onBind(){
		super.onBind();
		
		getView().setSearchBoxChangeHandler(new KeyUpHandler(){

			@Override
			public void onKeyUp(KeyUpEvent event){
				if(getView().getSearchText().length()<3){
					return;
				}
				if(timer!=null){
					timer.cancel();
				}else{
					timer = new Timer(){
						@Override
						public void run() {
							searchPatient(getView().getSearchText());
						}
						
					};
					timer.schedule(500);
				}
			}

			
			
		});
	}
	
	protected void searchPatient(String searchText) {
		System.out.println("calling");
		listpopup.show();
	}


	protected void displayPlace(String  place) {
		PlaceRequest pr = new PlaceRequest(place);
		placeManager.revealPlace(pr);
		
	}


}