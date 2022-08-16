package com.lti.dao;

import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.User;

public interface AdminDao {
	
	List<Admin> findAdminList();
	boolean validateAdmin(String security_id, String passcode);
	

}