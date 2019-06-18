package com.sc.springmvc.dao;

import java.util.List;
import java.util.Map;

import com.sc.springmvc.pojo.Examine;
import com.sc.springmvc.pojo.Paper;

public interface PaperDao {

	//�����Ծ�
	public int addPaper(Paper paper);
	
	public List<Paper> findPaper(Map<String, Object> param);
	
}
