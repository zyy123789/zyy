package com.mzy.test;

import java.util.ArrayList;
import java.util.List;

import com.mzy.utils.RandomUtil;
import com.mzy.utils.StringUtil;
import com.mzy.bean.Person;

public class PersonTest {

	public static void main(String[] args) {
		List<Person> list = new ArrayList<Person>();
		for (int i = 0; i < 10; i++) {
			list.add(new Person(StringUtil.getName(), RandomUtil.getRandom(10, 100), StringUtil.getChinese(10), RandomUtil.getRandom(20190101, 20191212)));
		}
		for (Person person : list) {
			System.out.println(person);
		}
	}
}
