package com.rishabh.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.rishabh.model.User;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	HibernateTemplate hibernateTemplate;
	
	@Override
	public int saveUser(User user) {
		int count = (Integer) this.hibernateTemplate.save(user);
		
		return count;
	}
	
	@Override
	public List<User> getAllUsers(){
		
		List<User> users = hibernateTemplate.loadAll(User.class);
		
		return users;
	}
	
}
