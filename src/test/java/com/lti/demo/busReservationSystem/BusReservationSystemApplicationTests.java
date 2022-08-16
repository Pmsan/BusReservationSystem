package com.lti.demo.busReservationSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;

import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.lti.beans.Admin;
import com.lti.beans.Bus;
import com.lti.beans.User;
import com.lti.dao.AdminDao;
import com.lti.dao.BusDao;
import com.lti.dao.UserDao;
import com.lti.service.BusService;
import com.lti.service.UserService;

@SpringBootTest
class BusReservationSystemApplicationTests {

	@Autowired
	BusService busservice;
	@MockBean
	BusDao busrepo;

	@Test
	void testaddBus() {
		Bus b1 = new Bus(101, "volvo", "blr", "mum", "2022-08-01", "sleeper", 50, 100, "sleeper", true);
		Bus b2 = new Bus(102, "volve", "blr", "mum", "2022-08-02", "sleeper", 60, 120, "multi-sleeper", false);
		List<Bus> busList = new ArrayList<>();
		busList.add(b1);
		busList.add(b2);
		System.out.println(busrepo.fetchallBus());
		Mockito.when(busrepo.fetchallBus()).thenReturn(busList);
		assertEquals(busList.get(0).getBusName(), "volvo");
	}

	@Test
	void testListBus() {
		Bus b1 = new Bus(101, "volvo", "blr", "mum", "2022-08-01", "sleeper", 50, 100, "sleeper", true);
		Bus b2 = new Bus(102, "volve", "blr", "mum", "2022-08-02", "sleeper", 60, 120, "multi-sleeper", false);
		List<Bus> busList = new ArrayList<Bus>();
		busList.add(b1);
		busList.add(b2);
		System.out.println(busList);
		assertEquals(2, busList.size());
	}

	@Autowired
	UserService userservice;

	@MockBean
	UserDao userdao;

	@Test
	void testaddUser() {
		User u1 = new User(10, "nitish", 9793, "nitish@", "1234", 'M', "delhi", (float) 1000.0);
		User u2 = new User(11, "nishant", 9790, "nitish@1", "12345", 'M', "noida", (float) 1200.0);
		List<User> userList = new ArrayList<>();
		userList.add(u1);
		userList.add(u2);
		System.out.println(userdao.findUserList());
		Mockito.when(userdao.findUserList()).thenReturn(userList);
		assertEquals(userList.get(0).getName(), "nitish");

	}
}
//	@Autowired
//	Admin adminservice;
//
//	@MockBean
//	AdminDao admindao;
//
//	@Test
//	void testfindAdminList() {
//		Admin b1 = new Admin("nitish@gmail","1234");
//		Admin b2 = new Admin("nishant@gamil","1234");
//		List<Admin> adminList = new ArrayList<>();
//		adminList.add(b1);
//		adminList.add(b2);
//		System.out.println(adminList);
//		assertEquals(2, adminList.size());
	

