package com.lti.dao;
import java.util.List;

import com.lti.beans.Admin;
import com.lti.beans.User;

public interface UserDao {

	int addUser(User a);
	boolean updateUser(User a);
	List<User> findUserList();
	User findUserById(int user_Id);
	boolean updateUser(int user_Id, int contact);
	boolean validateUser(int user_Id,String password);
	boolean regisUserValidate(String emailId);
}