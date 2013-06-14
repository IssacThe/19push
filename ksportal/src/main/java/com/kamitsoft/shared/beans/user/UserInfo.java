package com.kamitsoft.shared.beans.user;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.kamitsoft.client.ui.person.HasPersonInfo;
import com.kamitsoft.shared.beans.BeanInfo;

@Entity 
@Table(name="user_info")
public class UserInfo extends BeanInfo implements IsSerializable, HasPersonInfo{
	private long accountID;
	private long userID;
	private String userName;
	private String firstName;
	private String middleName;
	private String lastName;
	private AccountInfo accountInfo;
	
	

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String fn) {
		firstName = fn;
	}
	public void setLastName(String ln) {
		lastName = ln;
	}

	public String getLastName() {
		return lastName ;
	}
	
	@Id @GeneratedValue
	public long getUserID() {
		return userID;
	}
	public void setUserID(long userID) {
		this.userID = userID;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userLoginID) {
		this.userName = userLoginID;
	}
	public long getAccountID() {
		return accountID;
	}
	public void setAccountID(long accountID) {
		this.accountID = accountID;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="accountid")
    public AccountInfo getAccountInfo(){
		return accountInfo;
	}
	public void setAccountInfo(AccountInfo info){
		accountInfo = info;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
}
