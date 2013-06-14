package com.kamitsoft.server.persistent;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;


import com.kamitsoft.shared.beans.patient.PatientInfo;
import com.kamitsoft.shared.beans.user.AccountInfo;
import com.kamitsoft.shared.beans.user.UserInfo;

public class PersistentManager {

	 
	    private static final SessionFactory sessionFactory;
	 
	    static {
	        try {
	        	
	        	AnnotationConfiguration acfg = new AnnotationConfiguration();
	           
                acfg.configure();
               
                acfg.addPackage(PatientInfo.class.getPackage().getName()).addAnnotatedClass(PatientInfo.class);
                acfg.addPackage(UserInfo.class.getPackage().getName()).addAnnotatedClass(UserInfo.class);
                acfg.addPackage(AccountInfo.class.getPackage().getName()).addAnnotatedClass(AccountInfo.class);
                
                
                
                
                
                
	            sessionFactory= acfg.buildSessionFactory();
	           
	        } catch (Throwable ex) {
	            System.err.println("Initial SessionFactory creation failed." + ex);
	            throw new ExceptionInInitializerError(ex);
	        }
	    }
	 
	    public static SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }
	    
	    public static Session openSession() {
	        return sessionFactory.openSession();
	    }
	    
}

