package com.wjq;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BootStart {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		context.start();
		
		System.in.read();
		
	}
}
