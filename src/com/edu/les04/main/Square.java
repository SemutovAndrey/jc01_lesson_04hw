package com.edu.les04.main;

public class Square {

	public static void main(String[] args) {
	double a = 47;
	double S;
	double d;
	double r;
	double R;
	S = Math.pow(a, 2);
	d = a * Math.sqrt(2);
	r = a / 2;
	R = d / 2;
	System.out.println("Площадь квадрата = " + S);
	System.out.println("Диагональ квадрата = " + d);
	System.out.println("Радиус вписанной окружности = " + r);
	System.out.println("Радиус описанной окружности = " + R);
	
	}

}
