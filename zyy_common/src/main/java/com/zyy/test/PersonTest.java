package com.zyy.test;

import java.util.ArrayList;
import java.util.List;

import com.zyy.bean.Person;
import com.zyy.utils.RandomUtil;
import com.zyy.utils.StringUtil;

public class PersonTest {

	public static void main(String[] args) {
		//创建集合存放Person对象
		List<Person> list = new ArrayList<Person>();
		//向集合添加10000个Person对象
		for (int i = 0; i < 10000; i++) {
			list.add(new Person(StringUtil.generateChineseName(), RandomUtil.random(1, 120), StringUtil.randomChineseString(140), RandomUtil.random(20190101, 20191212)));
		}
		//遍历输出
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
