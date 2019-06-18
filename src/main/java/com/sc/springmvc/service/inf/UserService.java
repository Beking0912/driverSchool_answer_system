package com.sc.springmvc.service.inf;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sc.springmvc.pojo.User;

public interface UserService {

	public User findUserById(Integer id);
	
	/**
	 *  ͨ���û�������������û� 
	 */
	public List<User> findUser(Map<String, Object> param);
    
	//�����û�
    public int addUser(User user);
	
}
