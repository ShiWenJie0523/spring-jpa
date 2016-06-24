/**
 * @{#} UserServiceImpl.java Create on 2016年6月21日 下午2:12:37
 *
 * Copyright (c) 2016 by JRJ. 
 */

package com.lance.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lance.entity.User;
import com.lance.repository.IUserDao;
import com.lance.service.IUserService;

/**
  *
  * 
  * @history 
  * <PRE> 
  * --------------------------------------------------------- 
  * VERSION       DATE            BY       CHANGE/COMMENT 
  * --------------------------------------------------------- 
  * 1.0           2016年6月21日       wenjie.shi               create  
  * ---------------------------------------------------------
  * </PRE>
  *
  */

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	
	@Override
	public User findUserByName(String name) {
		return userDao.findUserByName(name);
	}

	@Override
	public List<User> getList() {
		return userDao.getList();
	}

}
