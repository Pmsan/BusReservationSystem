package com.lti.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lti.beans.User;
import com.lti.dao.UserDao;

@Service
public class UserSerImpl implements UserService {
	
	@Autowired
	UserDao dao;
	
	@Override
	public int addUser(User a) {
		System.out.println(" Inside service layer");
		return dao.addUser(a);
	}

	@Override
		public boolean updateUser(User a) {
			// TODO Auto-generated method stub
			boolean res=dao.updateUser(a);
			return true;
		}

	@Override
	public List<User> findUserList() {
		List<User> userList= dao.findUserList();
		return userList;
	}

	@Override
	public User findUserById(int user_Id) {
		return dao.findUserById(user_Id);
	}

	@Override
	public boolean updateUser(int user_Id, int contact) {
		// TODO Auto-generated method stub
		boolean res=dao.updateUser(user_Id, contact);
		User a=dao.findUserById(user_Id);
		if(a.getContact()==contact) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public boolean validateUser(int user_Id, String password) {
		return dao.validateUser(user_Id, password);
	}

	@Override
	public boolean regisUserValidate(String emailId) {
		return dao.regisUserValidate(emailId);
	}
	

}

