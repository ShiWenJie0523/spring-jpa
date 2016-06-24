/**
 * @{#} IUserService.java Create on 2016年6月21日 下午2:11:11
 *
 * Copyright (c) 2016 by JRJ. 
 */

package com.lance.service;

import java.util.List;

import com.lance.entity.User;

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

public interface IUserService {

	User findUserByName(String name);
	
	List<User> getList();
}
