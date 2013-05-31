package com.kamitsoft.server.persistent;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.classic.Session;


import com.kamitsoft.shared.beans.patient.PatientInfo;

public class PersistentManager {

	 
	    private static final SessionFactory sessionFactory;
	 
	    static {
	        try {
	            sessionFactory = new AnnotationConfiguration()
	                                .configure()
	                                .addPackage("com.kamitsoft.shared.beans.patient") //the fully qualified package name
	                                .addAnnotatedClass(PatientInfo.class)
	                                .buildSessionFactory();
	           
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

