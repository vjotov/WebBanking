package com.jotov.wb.services;

import java.util.List;
import com.jotov.wb.entities.User;


public interface UserService {
	boolean addUser(User student);

	List<User> getUsers();
}
