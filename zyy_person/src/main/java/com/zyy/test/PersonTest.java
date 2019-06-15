package com.zyy.test;

import java.util.ArrayList;
import java.util.List;

import com.zyy.bean.Person;
import com.zyy.utils.Randomutil;
import com.zyy.utils.StringUtil;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			list.add(new Person(StringUtil.getName(), Randomutil.getRandomNum(10, 100), StringUtil.getChinese(10), Randomutil.getRandomNum(20190101, 20191212)));
		}
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
