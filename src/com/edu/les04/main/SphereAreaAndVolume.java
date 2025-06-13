package com.edu.les04.main;

public class SphereAreaAndVolume {

	public static void main(String[] args) {
	double R = 31;
	double V;
	double S;
	V = 4.0 / 3 * Math.PI * Math.pow(R, 3);
	S = 4 * Math.PI * Math.pow(R, 2);
	System.out.println("Объем шара = " + V);
	System.out.println("Площадь поверхности шара = " + S);

	}

}
