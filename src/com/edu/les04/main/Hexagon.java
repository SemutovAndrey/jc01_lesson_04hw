package com.edu.les04.main;

public class Hexagon {

	public static void main(String[] args) {
	double a = 5;
	double h = 8;
	double P;
	double S;
	double V;
	P = 6 * a;
	S = (3 * Math.sqrt(3) * Math.pow(a, 2)) / 2;
	V = (3 * Math.sqrt(3)) / 2 * Math.pow(a, 2) * h;
	System.out.println("Периметр правильного шестигранника = " + P);
	System.out.println("Площадь правильного шестигранника = " + S);
	System.out.println("Объем призмы на основании правильного шестигранника = " + V);
	}

}
