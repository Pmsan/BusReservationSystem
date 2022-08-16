package com.lti.service;
import java.util.List;

import com.lti.beans.Admin;

public interface AdminService {

	List<Admin> findAdminList();
	boolean validateAdmin(String security_id,String passcode);

}