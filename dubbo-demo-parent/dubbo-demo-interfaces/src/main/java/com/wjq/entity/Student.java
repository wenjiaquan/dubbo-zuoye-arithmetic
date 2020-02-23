package com.wjq.entity;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private int age;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Student(Integer id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
}
