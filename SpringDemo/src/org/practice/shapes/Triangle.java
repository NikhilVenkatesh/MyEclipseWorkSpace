package org.practice.shapes;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements Shape {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	
	public Point getPointA() {
		return pointA;
	}


	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}


	public Point getPointB() {
		return pointB;
	}


	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}


	public Point getPointC() {
		return pointC;
	}


	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}


	public void draw() {
		System.out.println("Triangle Drawn ");
		System.out.println("PointA = "+getPointA().getX()+","+getPointA().getY());
		System.out.println("PointB = "+getPointB().getX()+","+getPointB().getY());
		System.out.println("PointC = "+getPointC().getX()+","+getPointC().getY());

	}


	/*@Override
	public void destroy() throws Exception {
		System.out.println("Interface Destroy method called");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface Init method called");
		
	}
	
	public void myInit(){
		System.out.println("My Init method called");
		
	}
	
	public void cleanUp(){
		System.out.println("My Destroy method called");
		
	}
*/}
