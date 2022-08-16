package com.lti.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.beans.Admin;
import com.lti.service.AdminService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/admin-api")
public class AdminController {
	
	@Autowired
	AdminService adminservice;
	
	
	// http://localhost:8090/admin-api/getadminlist
	@GetMapping("/getadminlist")
	public List<Admin> findAdminList() {
		System.out.println("Controller");
		List<Admin> adminList= adminservice.findAdminList();
		return adminList;
	}
	
//	//http://localhost:8090/admin-api/validateAdmin/hozefa@gmail.com/Hozefa1234@
//	@PostMapping("/validateAdmin")
//	public boolean validateAdmin(@PathVariable("security_id") String security_id,@PathVariable("passcode") String passcode) throws Exception
//	{
//		boolean response=service.validateAdmin(security_id,passcode);
//		return response;
//	}	
	
	//http://localhost:8090/admin-api/validateAdmin
	
	@PostMapping("/validateAdmin")
	public boolean validateAdmin(@RequestBody Admin a) {
		boolean response=adminservice.validateAdmin(a.getSecurity_id(),a.getPasscode());
		return response;
	}

}