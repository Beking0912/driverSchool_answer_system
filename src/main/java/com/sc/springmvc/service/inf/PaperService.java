package com.sc.springmvc.service.inf;

import java.util.List;
import java.util.Map;

import com.sc.springmvc.pojo.Paper;

public interface PaperService {

	//�����Ծ�
	public int addPaper(Paper paper);
		
	public List<Paper> findPaper(Map<String, Object> param);
	
}
