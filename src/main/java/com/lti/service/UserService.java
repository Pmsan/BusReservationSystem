package com.lti.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.beans.Admin;
import com.lti.beans.User;


public interface UserService{

	int addUser(User a);

	boolean updateUser(User a);

	List<User> findUserList();

	User findUserById(int user_Id);

	boolean updateUser(int user_Id, int contact);
	boolean validateUser(int user_Id,String password);
	boolean regisUserValidate(String emailId);
}