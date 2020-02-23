package com.wjq.service.impl;

import com.wjq.entity.Student;
import com.wjq.service.StudentService;

public class StudentServiceImpl implements StudentService {

	public Student getByid(Integer id) {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setId(id);
		student.setName("张三"+id);
		student.setAge(20);
		return student;
	}

	public int count() {
		// TODO Auto-generated method stub
		return 10;
	}

	public Student setAge(Student stu,int a) {
		// TODO Auto-generated method stub
		stu.setAge(stu.getAge()+a);
		return stu;
	}

	public int jia(int a, int b) {
		// TODO Auto-generated method stub
		int c=a+b;
		return c;
	}

	public int jian(int a, int b) {
		// TODO Auto-generated method stub
		int c=a-b;
		return c;
	}
	
	

}
