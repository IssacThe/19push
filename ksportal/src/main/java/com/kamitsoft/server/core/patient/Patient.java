package com.kamitsoft.server.core.patient;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.kamitsoft.client.security.UserContext;
import com.kamitsoft.server.persistent.PersistentManager;
import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.patient.PatientParameters;

public class Patient {
	
	private Session persistentSession;
	
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
		persistentSession = PersistentManager.openSession();
		Transaction transaction = persistentSession.beginTransaction();
		
		 try{
			 SQLQuery sql = persistentSession.createSQLQuery("SELECT patient.* FROM patient  "+
					 										 "WHERE (firstname ILIKE '"+params.getFreeText()+"%') "+
					 										    "OR (lastname  ILIKE '"+params.getFreeText()+"%') ");
			 sql.addEntity(PatientInfo.class);		   
		 	 List<PatientInfo> patients = sql.list();				
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
