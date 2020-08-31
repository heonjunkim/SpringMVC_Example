package com.biz.hello.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biz.hello.model.DeptVO;
import com.biz.hello.persistence.DeptDao;
import com.biz.hello.service.DeptService;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@Service(value="deptServiceV1")
public class DeptServiceImplV1 implements DeptService {
	
	@Autowired
	private DeptDao deptDao;

	@Override
	public List<DeptVO> selectAll() {
			
		return deptDao.selectAll();
	}

	@Override
	public DeptVO findByID(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(DeptVO vo) {
		int ret = deptDao.insert(vo);
		
		if(ret > 0) {
			log.debug("INSERT 성공 {}개 데이터 추가", ret);
		} else {
			log.debug("INSERT 실패 {}", ret);
		}
 
		return ret;
	}

	@Override
	public int update(DeptVO vo) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<DeptVO> findBytitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

}
