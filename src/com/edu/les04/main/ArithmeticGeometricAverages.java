package com.edu.les04.main;

public class ArithmeticGeometricAverages {

	public static void main(String[] args) {
	double a = 12.5;
	double b = 6.7;
	double A;
	double G;
	A = (Math.pow(a, 3) + Math.pow(b, 3)) / 2;
	G = Math.sqrt(Math.abs(a * b));
	System.out.println("Среднее арифметическое двух чисел = " + A);
	System.out.println("Среднее геометрическое модулей двух чисел = " + G);

	}

}
