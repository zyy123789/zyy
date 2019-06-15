package com.zyy.bean;

public class Person {

	private int pid;
	private String name;
	private int age;
	private String content;
	private int datea;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getDatea() {
		return datea;
	}
	public void setDatea(int datea) {
		this.datea = datea;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", name=" + name + ", age=" + age + ", content=" + content + ", datea=" + datea
				+ "]";
	}
	public Person(String name, int age, String content, int datea) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
		this.datea = datea;
	}
	
}
