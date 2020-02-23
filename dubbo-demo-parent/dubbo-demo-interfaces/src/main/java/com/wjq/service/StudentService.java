package com.wjq.service;

import com.wjq.entity.Student;

public interface StudentService {
	Student getByid(Integer id);
	
	int count();
	
	Student setAge(Student stu,int a);
	
	int jia(int a,int b);
	
	int jian(int a,int b);
}
