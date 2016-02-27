package org.practice.springAOP.service;

import org.practice.springAOP.model.Circle;
import org.practice.springAOP.model.Triangle;

public class ShapeService {

		private Circle circle;
		private Triangle triangle;
		
		public Circle getCircle() {
			System.out.println("circle getter called");

			return circle;
		}
		public void setCircle(Circle circle) {
			this.circle = circle;
		}
		public Triangle getTriangle() {
			return triangle;
		}
		public void setTriangle(Triangle triangle) {
			this.triangle = triangle;
		}
		
		
}
