package com.jotov.wb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jotov.wb.constants.UrlConstants;
import com.jotov.wb.entities.User;
import com.jotov.wb.services.UserService;

@Controller
public class BankController {

	@Autowired
	@Qualifier("UserServiceImpl")
	private UserService userService;
	
	@RequestMapping(value=UrlConstants.ACCOUNT_URL + "/{id}") //:.+}")
	public String viewAccount(@PathVariable long id, Model model){
		User user = userService.getUser(id);
		model.addAttribute("user", user);
		model.addAttribute("userRegistryUrl", UrlConstants.USER_REGISTER_URL);
		model.addAttribute("widrawUrl", UrlConstants.WIDRAW_URL);
		model.addAttribute("depositUrl", UrlConstants.DEPOSIT_URL);
		
		return "";
	}
	
	public String widraw(Model model){
		return "";
	}
	
	public String deposit(Model model){
		return "";
	}
}
