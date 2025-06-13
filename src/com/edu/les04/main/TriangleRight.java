package com.edu.les04.main;

public class TriangleRight {

	public static void main(String[] args) {
		double x1 = -6, y1 = -8;
		double x2 = 5, y2 = 7;
		double x3 = 5, y3 = -8;
		double a;
		double b;
		double c;
		b = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
		c = Math.sqrt(Math.pow((x3 - x1), 2) + Math.pow((y3 - y1), 2));
		a = Math.sqrt(Math.pow(b, 2) + Math.pow(c, 2));
		System.out.println("длина гипотенузы a = " + a);
		System.out.println("длина катета b = " + b);
		System.out.println("длина катета c = " + c);
		
	}

}
