package com.biz.hello.service;

import java.util.List;

import com.biz.hello.model.DeptVO;

public interface DeptService
		extends GenericService<DeptVO, String>{
	
	public List<DeptVO> findBytitle(String title);

}
