package com.zomato.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class ZomatoUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		//Triangle triangle = new Triangle();
		//triangle.draw();
		UserProfile profile=(UserProfile)context.getBean("profile");

		
		profile.Display();
	}

}
