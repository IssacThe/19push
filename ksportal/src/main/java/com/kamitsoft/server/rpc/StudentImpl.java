package com.kamitsoft.server.rpc;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.kamitsoft.shared.beans.StudenttInfo;

@RemoteServiceRelativePath("Etudiant")
public interface StudentImpl extends RemoteService {
public StudenttInfo getClient() throws Exception;
}