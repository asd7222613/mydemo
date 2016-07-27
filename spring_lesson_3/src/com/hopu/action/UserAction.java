package com.hopu.action;

import java.util.List;

import com.hopu.entity.User;
import com.hopu.service.UserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {

	private UserService userService;
	
	public String login() {
		List<User> list = userService.showUser();
		list.forEach((user) -> System.out.println(user.getUserName()));
		return SUCCESS;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
}
