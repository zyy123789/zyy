package com.baidu.service;

import java.util.List;
import java.util.Map;

public interface MovieService {

	List<Map<String, Object>> getList(Map<String, Object> map);

	int delete(String mids);

	int updatesid(int mid);

	int updateSid(int mid);

}
