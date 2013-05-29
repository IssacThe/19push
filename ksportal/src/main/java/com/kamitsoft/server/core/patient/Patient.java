package com.kamitsoft.server.core.patient;

import java.util.ArrayList;

import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;

public class Patient {
	
	public ArrayList<Integer> search(PatientParameters searchParams){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(201);
		result.add(203);
		result.add(205);
		return result;
		
	}

	public ArrayList<PatientInfo> getFromIDs(UserContext context, ArrayList<Integer> ids) {
		
		
		return null;
	}

	public ArrayList<PatientInfo> searchPatient(UserContext context,PatientParameters params) {
		ArrayList<PatientInfo> patients = new ArrayList<PatientInfo>();
		PatientInfo p =  new PatientInfo();
		p.setFirstName("Fadel");
		p.setLastName("Toure");
		patients.add(p);
		
		PatientInfo q =  new PatientInfo();
		q.setFirstName("Issac");
		q.setLastName("Ndiaye");
		patients.add(q);
		
		return patients;
	}

}
