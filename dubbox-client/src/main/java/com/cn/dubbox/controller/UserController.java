package com.cn.dubbox.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.dubbox.service.UserService;


@Controller
@RequestMapping("/user")
public class UserController {
	private UserService userService;
	
	@RequestMapping("/showName")
	@ResponseBody
	public String showName(){
		return userService.getName();
	}
}
