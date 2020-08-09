package com.maplegjswns.drake.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maplegjswns.drake.dao.DrakeDao;
import com.maplegjswns.model.DrakeVO;

@Service
public class DrakeServiceImpl implements DrakeService {
	
	
	@Autowired
	private SqlSession sqlSession;
	private DrakeDao drakeDao;
	
	
	@Autowired
	public void getMapper() {
		this.drakeDao = sqlSession.getMapper(DrakeDao.class);
	}

	@Override
	public List<DrakeVO> selectAll() {
		
		List<DrakeVO> drakeList = drakeDao.selectAll();

		return drakeList;
	}

	@Override
	public DrakeVO findBySeq(long seq) {
		
		DrakeVO drakeVO = drakeDao.findBySeq(seq);

		return drakeVO;
	}

	@Override
	public int insert(DrakeVO drakeVO) {
		
		int ret = drakeDao.insert(drakeVO);

		return ret;
	}

	@Override
	public int update(DrakeVO drakeVO) {
		

		return 0;
	}

	@Override
	public int delete(long seq) {
		int ret = drakeDao.delete(seq);

		return ret;
	}
	
	

	

}
