package com.sc.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.sc.springmvc.pojo.Examine;

public interface ExamineDao {

	
	//�������Խ��
	public int addExamine(Examine examine);
	
	public List<Examine> findExamine(Map<String, Object> param);
	
}
