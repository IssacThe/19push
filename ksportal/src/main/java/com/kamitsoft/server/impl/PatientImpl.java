package com.kamitsoft.server.impl;

import java.util.ArrayList;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.server.core.patient.Patient;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;

@Singleton
public class PatientImpl extends RemoteServiceServlet implements com.kamitsoft.remote.rpc.Patient{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Inject private Patient patient;
    
    @Override
    public ArrayList<Integer> search(UserContext context,PatientParameters params) throws Exception {
        return patient.search(params);
    }
    public ArrayList<PatientInfo> getFromIDs(UserContext context, ArrayList<Integer> ids) throws Exception{
        return patient.getFromIDs(context,ids);
    }
    public ArrayList<PatientInfo> searchPatient(UserContext context,PatientParameters params) throws Exception{
        return patient.searchPatient(context,params);
    }

}
