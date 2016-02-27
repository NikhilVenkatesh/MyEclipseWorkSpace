package org.practice.springDao;

import org.practice.springDao.daoimpl.JdbcDaoImpl;
import org.practice.springDao.model.Circle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JdbcDemo {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("springDao.xml");
		JdbcDaoImpl dao = ctx.getBean("jdbcDaoImpl", JdbcDaoImpl.class);
		//Circle circle =dao.getCircle(1);
		//System.out.println(circle.getName());
		dao.insertCircle(new Circle(3, "Third Circle"));
		//System.out.println(dao.getAllCircles().size());
		//System.out.println(dao.getCircleCount());
		//System.out.println(dao.getCircleName(1));
		
	}

}
