package com.fita;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		A obj = (A) ctx.getBean("aobj");// object creation using spring context
//		A aobj=new A();//normal java
		obj.m1();
//        Coach->BB coach or hockey coach
		Coach coach = ctx.getBean("hockey", Coach.class);
		coach.todayActivity();

	}

}
