package com.sc.springmvc.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.sc.springmvc.pojo.Student;
import com.sc.springmvc.pojo.User;

public interface StudentDao {

	/** 
	 * ������ ��  StudentMapper.xml �ļ��е� sql���� id ��ͬ
	 */
	
	/**
	 *  ͨ��id���ҿ��� 
	 */
	public List<Student> findStudent(Map<String, Object> param);
	
	/**
	 *  �������� 
	 */
	public int addStudent(Student student);
	
	
}
