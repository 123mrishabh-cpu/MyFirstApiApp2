package com.rishabh.dao;

import java.util.List;

import com.rishabh.model.User;

public interface UserDao {
	public int saveUser(User user);
	public List<User> getAllUsers();
}
