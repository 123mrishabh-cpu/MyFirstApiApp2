package com.rishabh.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rishabh.dao.UserDao;
import com.rishabh.model.User;

@Service
public class UserService {
	@Autowired
	private UserDao userDao;
	
	@Transactional
	public boolean registerUser(User user) {
		if(
				user.getName().trim().equals("") ||
				user.getEmail().trim().equals("") ||
				user.getPhoneNo().trim().equals("") ||
				user.getAge()<1
				) {
			System.out.println("no user inserted.");
			return false;
		}
		
		this.userDao.saveUser(user);
		
		return true;
	}
	
	public List<User> getAllUsers(){
		
		return userDao.getAllUsers();
	}
	
}
