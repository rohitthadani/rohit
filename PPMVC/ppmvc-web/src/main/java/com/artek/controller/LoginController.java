package com.artek.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.artek.model.User;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String showLogin(Map<String,Object> map){
		map.put("user", new User());
		return "login";
	}
	
	@RequestMapping(value="/checkLogin",method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("user") User usr, ModelMap model){
		
		System.out.println(usr.getEmailId());
		System.out.println(usr.getPassword());
		
		/*model.addAttribute("uname", usr.getEmailId());
		model.addAttribute("pass", usr.getPassword());*/
		
		return "login";
		//return "loginresult";		
	}	
}