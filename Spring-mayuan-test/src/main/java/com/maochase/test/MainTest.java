package com.maochase.test;

import com.maochase.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("SpringBean.xml");
		HelloService hello = (HelloService) classPathXmlApplicationContext.getBean("hello");
		hello.sayHello();
	}
}
