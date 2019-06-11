package com.baidu.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baidu.mapper.MovieMapperDao;

@Service
public class MovieServiceImpl implements MovieService {
	
	@Autowired
	private MovieMapperDao dao;

	public List<Map<String, Object>> getList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return dao.getList(map);
	}

	@Override
	public int delete(String mids) {
		// TODO Auto-generated method stub
		return dao.delete(mids);
	}

	@Override
	public int updatesid(int mid) {
		// TODO Auto-generated method stub
		return dao.updatesid(mid);
	}

	@Override
	public int updateSid(int mid) {
		// TODO Auto-generated method stub
		return dao.updateSid(mid);
	}

}
