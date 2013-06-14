package com.kamitsoft.client.ui.loader;

import com.google.gwt.user.client.rpc.AsyncCallback;

public abstract class AsyncCall<T> implements AsyncCallback<T> 
{   private LoadIndicator loadingIndicator;
    public AsyncCall(){	
    	if(loadingIndicator == null){
    		loadingIndicator = new LoadIndicator();
    	}
    	loadingIndicator.show();
    }

    public final void onFailure(Throwable caught) {    
    	loadingIndicator.hide();    
        didFail(caught); 
    } 

    public final void onSuccess(T result){       
    	loadingIndicator.hide();       
        didSuccess(result);     
    }
    /** the failure method needed to be overwritte */   
    protected abstract void didFail(Throwable caught);  
    
    /** overwritte to do something with result */
    protected abstract void didSuccess(T result); 
}