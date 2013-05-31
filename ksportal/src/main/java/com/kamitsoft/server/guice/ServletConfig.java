/*
 * Copyright 2009 by Medrium.com, Inc.,
 * All rights reserved.
 *
 * This software is the confidential and proprietary information 
 * of Medrium.com, Inc.
 *
 * @author Remy Beaumont
 */

// PSM - Similar to ServletContextListener but disable verify in sharedlogin
// for demo purposes where all servers run on Amazon and domain name is 
// not available
package com.kamitsoft.server.guice;


import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.google.inject.servlet.ServletModule;
import com.kamitsoft.server.impl.PatientImpl;



public class ServletConfig extends GuiceServletContextListener {


		  @Override
		  protected Injector getInjector() {
		    return Guice.createInjector(new ServletModule(){

		        @Override
		        protected void configureServlets() {
		          serve("/ksaportal/patient").with(PatientImpl.class);
		        }
		        });
		  }
		  
}
