package com.maplegjswns.drake.dao;

import java.util.List;


import com.maplegjswns.model.DrakeVO;

public interface DrakeDao {
	
	public List<DrakeVO> selectAll();
	public DrakeVO findBySeq(long seq);
	
	public int insert(DrakeVO drakeVO); 
	public int update(DrakeVO drakeVO);
	public int delete(long seq);
	
	
	
	 
	
	
	

}
