package com.spring.lab13;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("config.xml");
	   
	   SBU sb=ctx.getBean(SBU.class,"sb");
//	    System.out.println("Employee Details:");
//	    System.out.println(emp1.toString());
//	    System.out.println("SBU Details:");
//        System.out.println(emp1.getSb().toString());
//	    System.out.println("Employee Details:");
//	    System.out.println(emp2.toString());
//	    System.out.println("SBU Details:");
//    System.out.println(emp2.getSb().toString());
//	    System.out.println("Employee Details:");
//	    System.out.println(emp3.toString());
//	    System.out.println("SBU Details:");
//	    System.out.println(emp3.getSb().toString());
	   System.out.println("SBU Details:");
	System.out.println(sb);
	
	}
}
