package org.practice.springAOP.service;

import org.practice.springAOP.aspect.LoggingAspect;
import org.practice.springAOP.model.Circle;

public class ShapeServiceProxy extends ShapeService {
	public Circle getCircle(){
		new LoggingAspect().loggingAdvice();
		return super.getCircle();
	}
}
