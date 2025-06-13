package com.edu.les04.main;

public class Sector {

	public static void main(String[] args) {
		double R = 23;
		double alphaDegrees = 45.0;
		double alphaRadians = Math.toRadians(alphaDegrees);
		double S;
		double L;
		S = (Math.pow(R, 2) * alphaRadians) / 2;
		L = R * alphaRadians;
		System.out.println("Площадь сектора = " + S);
		System.out.println("Длина дуги = " + L);
		
		 

	}

}
