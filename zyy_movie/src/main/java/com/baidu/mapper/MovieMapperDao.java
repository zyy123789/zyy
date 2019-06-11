package com.baidu.mapper;

import java.util.List;
import java.util.Map;

public interface MovieMapperDao {

	List<Map<String, Object>> getList(Map<String, Object> map);

	int delete(String mids);

	int updatesid(int mid);

	int updateSid(int mid);

}
