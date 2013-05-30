package com.kamitsoft.server.core.patient;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.server.persistent.PersistentManager;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;

public class Patient {
	
	private Session persistentSession = PersistentManager.openSession();
	
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
	@SuppressWarnings("unchecked")
	public ArrayList<PatientInfo> searchPatient(UserContext context,PatientParameters params) {
		Transaction transaction = persistentSession.beginTransaction();
		
		
		 try { 
			 	List<PatientInfo> patients = persistentSession.createQuery("FROM PatientInfo").list();
			 	transaction.commit();
			 	return new ArrayList<PatientInfo>(patients);
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	        } finally {
	        	persistentSession.close();
	        }
		
		return null;
	}

}
