package com.sc.springmvc.service.inf;

import java.util.List;
import java.util.Map;

import com.sc.springmvc.pojo.Student;

public interface StudentService {

	/**
	 *  ͨ��id���ҿ��� 
	 */
	public List<Student> findStudent(Map<String, Object> param);
	
	/**
	 *  �������� 
	 */
	public int addStudent(Student student);
	
	
}
