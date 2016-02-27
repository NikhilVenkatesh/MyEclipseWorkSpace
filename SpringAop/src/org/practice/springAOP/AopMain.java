package org.practice.springAOP;

import org.practice.springAOP.service.FactoryService;
import org.practice.springAOP.service.ShapeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("springAOP.xml");
		//ShapeService shapeservice = (ShapeService)ctx.getBean("ShapeService");
		//ShapeService shapeservice = ctx.getBean("ShapeService",ShapeService.class);
		
		FactoryService factoryService = new FactoryService();
		ShapeService shapeService = (ShapeService) factoryService.getBean("shapeService");
		
		shapeService.getCircle();
		//System.out.println(shapeservice.getCircle().getName());
		//System.out.println(shapeservice.getTriangle().getName());
	}

}
