package com.mzy.bean;

public class Person {

	private String name;
	private int age;
	private String content;
	private int datea;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
		return "Person [name=" + name + ", age=" + age + ", content=" + content + ", datea=" + datea
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
