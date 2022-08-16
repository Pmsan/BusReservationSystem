package com.lti.demo.busReservationSystem;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.lti.beans.Admin;
import com.lti.dao.AdminDao;

class testcase_admin {

	@Autowired
	Admin adminservice;

	@MockBean
	AdminDao admindao;

	@Test
	void testfindAdminList() {
		Admin b1 = new Admin("nitish@gmail", "1234");
		Admin b2 = new Admin("nishant@gamil", "1234");
		List<Admin> adminList = new ArrayList<>();
		adminList.add(b1);
		adminList.add(b2);
		System.out.println(adminList);
		//assertEquals(2, adminList.size());
	}
	@Test
	void testvalidateAdmin() {
		Admin a1 = new Admin("rahul@gmail.com", "1234");
		List<Admin> adminList = new ArrayList<>();
		adminList.add(a1);
		System.out.println(adminList);
		assertEquals("rahul@gmail.com",a1.getSecurity_id());
	}

}
