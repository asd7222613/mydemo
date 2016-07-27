package com.hopu.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.hopu.dao.UserDAO;
import com.hopu.entity.User;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public List<User> showUser() {
		List<User> list = getHibernateTemplate().findByExample(new User());
		System.out.println(list.size());
		return null;
	}

}
