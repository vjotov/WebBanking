package com.jotov.wb.services;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.jotov.wb.entities.User;

@Service("UserServiceImpl")
public class UserServiceImpl implements UserService {

	private static List<User> users = new ArrayList<User>(); 
	
	@Override
	public boolean addUser(User user) {
		users.add(user);
		
		return true;
	}

	@Override
	public List<User> getUsers() {
		return users;
	}

}
