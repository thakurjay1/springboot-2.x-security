package com.security.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.models.User;
 
@Service
public class UserService {
	List<User> list = new ArrayList<User>();

	public UserService() {
		list.add(new User("jay", "jay", "jaythakur9758@gmail.com"));
		list.add(new User("yash", "yash", "yashthakur9758@gmail.com"));
		list.add(new User("rishabh", "rishabh", "rishabhthakur9758@gmail.com"));
	}
	
	//get all users
	public List<User> getAllUsers(){
		return this.list;
	}
	
	//get single user
	public User getUser(String userName) {
		return this.list.stream().filter((user)->user.getUsername().equals(userName)).findAny().orElse(null);
	}
	
	//add single user
	public User addUser(User user) {
		this.list.add(user);
		return user;
	}
	
	
}
