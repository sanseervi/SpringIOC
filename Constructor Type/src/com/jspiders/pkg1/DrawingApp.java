package com.jspiders.pkg1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
				//BeanFactory factory= new XmlBeanFactory(new FileSystemResource("spring.xml"));
				ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
				//Triangle triangle = new Triangle();
				//triangle.draw();
				Triangle triangle0=(Triangle)context.getBean("triangle0");
				Triangle triangle1=(Triangle)context.getBean("triangle1");
				Triangle triangle2=(Triangle)context.getBean("triangle2");
				
				triangle0.draw();
				triangle1.draw();
				triangle2.draw();
	}
}