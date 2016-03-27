package com.jotov.wb.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jotov.wb.constants.UrlConstants;
import com.jotov.wb.entities.User;
import com.jotov.wb.services.UserService;

@Controller
public class UserController {

	@Autowired
	@Qualifier("UserServiceImpl")
	private UserService userService;
	
	@RequestMapping(value=UrlConstants.USER_REGISTER_URL, method=RequestMethod.GET)
	public String getUsers(Model model){
		model.addAttribute("users", userService.getUsers());
		model.addAttribute("addUserUrl", UrlConstants.ADD_USER_URL);
		
		return "userRegister";
	}
	
	@RequestMapping(value=UrlConstants.ADD_USER_URL, method=RequestMethod.GET)
	public String addUser(Model model) {
		User user = new User();
		user.setName("Set in Controller");
		model.addAttribute("user", user);
		model.addAttribute("saveUrl", UrlConstants.SAVE_USER_URL);
		
		return "addUser";
	}
	
	@RequestMapping(value=UrlConstants.SAVE_USER_URL, method = RequestMethod.POST)
	public String addUser(Model model, @ModelAttribute("user") User user, HttpServletRequest request) {
		userService.addUser(user);
		
		model.addAttribute("users", userService.getUsers());
		model.addAttribute("addUserUrl", UrlConstants.ADD_USER_URL);
		
		return "userRegister";
	}
}
