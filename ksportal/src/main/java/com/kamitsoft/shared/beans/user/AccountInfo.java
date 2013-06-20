package com.kamitsoft.shared.beans.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.google.gwt.user.client.rpc.IsSerializable;
import com.kamitsoft.shared.beans.BeanInfo;


@Entity 
@Table(name="account")
public class AccountInfo extends BeanInfo implements IsSerializable{
    
    
    private long accountID;
    private String accountName;
    private String accountDescription;
    
    
    @Id @GeneratedValue
    public long getAccountID() {
        return accountID;
    }
    public void setAccountID(long accountID) {
        this.accountID = accountID;
    }
    public String getAccountName() {
        return accountName;
    }
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
    public String getAccountDescription() {
        return accountDescription;
    }
    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }
    

}
