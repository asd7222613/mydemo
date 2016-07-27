package com.hopu.service.impl;

import java.util.List;

import com.hopu.dao.UserDAO;
import com.hopu.entity.User;
import com.hopu.service.UserService;

public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	
	@Override
	public List<User> showUser() {
		return userDAO.showUser();
	}


	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
