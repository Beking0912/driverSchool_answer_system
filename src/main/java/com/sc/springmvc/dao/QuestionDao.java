package com.sc.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.sc.springmvc.pojo.Question;

public interface QuestionDao {

	/**
	 *  �����ȡ10������ 
	 */
	public List<Question> randomFind10Question(Map<String, Object> param);
	
	
	public List<Question> findQuestionbyId(Map<String, Object> param);
	
	
}
