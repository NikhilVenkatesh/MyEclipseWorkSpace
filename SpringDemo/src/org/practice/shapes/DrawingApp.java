package org.practice.shapes;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {
public static void main(String[] args) {
	//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
	//Triangle triangle = (Triangle)factory.getBean("triangle");

	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
	//context.registerShutdownHook();
	Shape shape = (Circle)context.getBean("circle");
	shape.draw();
	//System.out.println(context.getMessage("greeting", null,"Default Greeting", null));
}
}
