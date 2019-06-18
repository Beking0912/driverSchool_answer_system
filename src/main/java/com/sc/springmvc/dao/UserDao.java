package com.sc.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sc.springmvc.pojo.User;

public interface UserDao {

	/** 
	 * ������ ��  UserMapper.xml �ļ��е� sql���� id ��ͬ
	 */
    public User findUserById(Integer id);
    
	/**
	 *  ͨ���û�������������û� 
	 */
    public List<User> findUser(Map<String, Object> param);
    
    //�����û�
    public int addUser(User user);
	
}
