package com.kamitsoft.remote.rpc;

import java.util.ArrayList;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;


@RemoteServiceRelativePath("patient")
public interface Patient extends RemoteService {
    
    public ArrayList<Integer> search(UserContext context,PatientParameters params) throws Exception;
    public ArrayList<PatientInfo> getFromIDs(UserContext context, ArrayList<Integer> ids) throws Exception;
    public ArrayList<PatientInfo> searchPatient(UserContext context,PatientParameters params) throws Exception;

}