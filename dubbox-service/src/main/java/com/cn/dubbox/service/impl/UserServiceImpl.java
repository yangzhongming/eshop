package com.cn.dubbox.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cn.dubbox.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	public String getName() {
		
		return "Hello World....";
	}

}
