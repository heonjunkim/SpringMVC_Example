package com.biz.hello.persistence;

import java.util.List;

import com.biz.hello.model.DeptVO;

public interface DeptDao extends GenericDao<DeptVO, String> {
	
	public List<DeptVO> findByTitle(String title);

}
