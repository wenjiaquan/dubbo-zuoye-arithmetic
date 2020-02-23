package com.wjq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wjq.entity.Student;
import com.wjq.service.StudentService;

public class ConsumerStart {
	private static StudentService studentService;
	private static ClassPathXmlApplicationContext context;
	public static void main(String[] args) {
		
		context = new ClassPathXmlApplicationContext("classpath:ApplicantionContext.xml");
		studentService=context.getBean(StudentService.class);
		
		Student stu = studentService.getByid(20);
		System.out.println("student is" + stu);

		Student setAge = studentService.setAge(stu, 5);
		System.out.println("加岁数以后的数据 " + setAge);

		System.out.println("两数相加的结果："+studentService.jia(2,3));
		System.out.println("两数相减的结果："+studentService.jian(6,3));
	}
}
