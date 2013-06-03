package com.kamitsoft.server.core.user;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.kamitsoft.server.persistent.PersistentManager;
import com.kamitsoft.shared.beans.user.UserInfo;

public class User {
	private Session persistentSession;
	
	public UserInfo login(String accountName , String userName, String password) {
		persistentSession = PersistentManager.openSession();
		Transaction transaction = persistentSession.beginTransaction();
		
		 try{
			 SQLQuery sql = persistentSession.createSQLQuery(" SELECT user_info.* "+
					 										 " FROM user_info  "+
					 										 " LEFT JOIN account USING(accountid) "+
					 										 " WHERE (account.accountname = '"+accountName+"') "+
					 										 " AND (user_info.username = '"+userName+"') "+
					 										 " AND (user_info.password = '"+password+"') ");
			 sql.addEntity(UserInfo.class);	
			 List<UserInfo> v = sql.list();
			Hibernate.initialize(v);
		 	 UserInfo user = (UserInfo) (v.get(0));				
		 	 transaction.commit();
		 	 return user;
	        } catch (HibernateException e) {
	            transaction.rollback();
	            e.printStackTrace();
	         
	        } finally {
	        	persistentSession.close();
	        }
		
		return null;
	
	}

}
