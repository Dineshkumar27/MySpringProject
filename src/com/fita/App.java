package com.fita;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("basic.xml");
		A obj = (A) ctx.getBean("aobj");
		obj.m1();

//		Coach coach = ctx.getBean("basketball", Coach.class);
//		coach.todayActivity();
	}

}
