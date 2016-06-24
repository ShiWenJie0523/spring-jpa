/**
 * @{#} IUserDao.java Create on 2016年6月21日 下午2:07:53
 *
 * Copyright (c) 2016 by JRJ. 
 */

package com.lance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

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
@Repository("userDao")
public interface IUserDao extends CrudRepository<User, Integer> {

	@Query("select t from User t where t.username =:name")
	User findUserByName(@Param("name") String name);
	
	@Query("select t from User t ")
	List<User> getList();
}
