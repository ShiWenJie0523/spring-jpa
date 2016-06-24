package com.lance.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lance.entity.User;
import com.lance.service.IUserService;

@Controller
public class IndexController {
	
	@Autowired
	private IUserService userServiceImpl;
	
	@RequestMapping(value={" ", "/", "/index"})
	public String index(){
		User user = userServiceImpl.findUserByName("jack");
		System.out.println(user.getPassword());
		return "index";
	}
}
