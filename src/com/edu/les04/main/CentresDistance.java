package com.edu.les04.main;

public class CentresDistance {

	public static void main(String[] args) {
		double x1 = 4, y1 = 8;
		double x2 = 10, y2 = -12;
		double L;
		L = Math.sqrt(Math.pow((x2 -x1), 2) + Math.pow((y2 - y1), 2));
		System.out.println("Расстояние между центрами окружностей = " + L);
	}

}
