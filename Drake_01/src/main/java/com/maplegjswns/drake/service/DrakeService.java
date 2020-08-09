package com.maplegjswns.drake.service;

import java.util.List;

import com.maplegjswns.model.DrakeVO;

public interface DrakeService {
	

	public List<DrakeVO> selectAll();
	

	public DrakeVO findBySeq(long seq);

	public int insert(DrakeVO drakeVO);

	public int update(DrakeVO drakeVO);

	public int delete(long seq);

}
