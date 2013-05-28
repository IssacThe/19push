package com.kamitsoft.remote.rpc;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kamitsoft.shared.beans.patient.PatientParameters;

@RemoteServiceRelativePath("Patient")
public interface Patient  extends RemoteService {
	
	
	public ArrayList<Integer> search(PatientParameters params) throws Exception;
	
}