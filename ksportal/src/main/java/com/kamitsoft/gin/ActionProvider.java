package com.kamitsoft.gin;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.ServiceDefTarget;


public class ActionProvider<T> {
	public T get(Class c){
		 T clientManager =(T)GWT.create(c);
		 
		   ((ServiceDefTarget) clientManager).setServiceEntryPoint(GWT.getModuleBaseURL()+c.getName());
		
		   return clientManager;
	}

}
