package com.kamitsoft.server.core.patient;

import java.util.ArrayList;

import com.kamitsoft.shared.beans.patient.PatientParameters;

public class Patient {
	
	public ArrayList<Integer> search(PatientParameters searchParams){
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(201);
		result.add(203);
		result.add(205);
		return result;
		
	}

}
