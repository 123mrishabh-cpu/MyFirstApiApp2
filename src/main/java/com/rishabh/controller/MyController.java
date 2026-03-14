package com.rishabh.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rishabh.model.User;
import com.rishabh.service.UserService;

@Controller
public class MyController {
	@Autowired
	private UserService userService;
	
	@GetMapping("/openForm")
	public String openForm() {
		return "register";
	}
	
	@GetMapping("/success")
	public String success() {
		return "success";
	}
	
	@RequestMapping(value = "/RegUser", method = RequestMethod.POST)
	@ResponseBody
	public String registerUser(@Valid @ModelAttribute User user, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
//			model.addAttribute("errorMsg", "something went wrong!");
			return "something went wrong!";
		}
		
		boolean saved = this.userService.registerUser(user);
		
		if(saved) {
			return "registerd sucessfully";
		}
		else {
//			model.addAttribute("errorMsg", "blank field error");
			return "blank field error";
		}
	}
	
}
