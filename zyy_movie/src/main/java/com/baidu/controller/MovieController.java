package com.baidu.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baidu.service.MovieService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class MovieController {

	@Autowired
	private MovieService service;
	
	@RequestMapping("list.do")
	public String getList(Model model, @RequestParam(defaultValue="1")int cpage
//			, @RequestParam(defaultValue="desc")String oo
			, @RequestParam(defaultValue="")String mname
			, @RequestParam(defaultValue="")String name
			, @RequestParam(defaultValue="")String t1
			, @RequestParam(defaultValue="")String t2
			, @RequestParam(defaultValue="")String p1
			, @RequestParam(defaultValue="")String p2
			, @RequestParam(defaultValue="")String year) {
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("mname", mname);
		map.put("name", name);
		map.put("t2", t2);
		map.put("t1", t1);
		map.put("p1", p1);
		map.put("p2", p2);
		map.put("year", year);
//		map.put("oo", oo);
		//开启分页
		PageHelper.startPage(cpage, 3);
		//查询
		List<Map<String,Object>> mList = service.getList(map);
		//分页
		PageInfo<Map<String,Object>> pageInfo = new PageInfo<Map<String,Object>>(mList);
		model.addAttribute("list", mList);
		model.addAttribute("page", pageInfo);
		model.addAttribute("map", map);
		return "list";
	}
	
	//批量删除
	@ResponseBody
	@RequestMapping("delete.do")
	public int delete(String mids) {
		int i = service.delete(mids);
		return i;
	}
	
	//下架
	@RequestMapping("down.do")
	public String updatesid(int mid) {
		int i = service.updatesid(mid);
		return "redirect:list.do";
	}
	//上架
	@RequestMapping("up.do")
	public String updateSid(int mid) {
		int i = service.updateSid(mid);
		return "redirect:list.do";
	}
}
