package com.edu.les04.main;

public class NumbersSum {

	public static void main(String[] args) {
		int a= 7658;
		int sum = 0;
		if (a < 1000 || a >9999) {
		System.out.println("Число не четырехзначное");
		return;
		}
		while (a > 0) {
		int temp = a % 10;
		sum = sum + temp;
		a = a / 10;
		}
		System.out.println("Сумма цифр четырехзначного числа = " + sum);
		}

	}


