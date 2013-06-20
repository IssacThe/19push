package com.kamitsoft.shared.beans;

import java.sql.Timestamp;

import com.google.gwt.user.client.rpc.IsSerializable;

public class BeanInfo implements IsSerializable{
    private Timestamp created;
    private String createdBy;
    private Timestamp lastUpdated;
    private String lastUpdatedBy;
    
    public Timestamp getCreated() {
        return created;
    }
    public void setCreated(Timestamp created) {
        this.created = created;
    }
    public String getCreatedBy() {
        return createdBy;
    }
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
    public Timestamp getLastUpdated() {
        return lastUpdated;
    }
    public void setLastUpdated(Timestamp lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }
    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }
    
}
