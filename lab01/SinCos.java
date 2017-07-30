package com.edocti.javaintro.lab01;

public class SinCos {

	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		x = Math.toRadians(x);
		double sinx = Math.sin(x);
		double cosx = Math.cos(x);
		double result = sinx * sinx + cosx * cosx;
		
		System.out.printf("%.20f\n", result);
		System.out.println(Math.pow(x, 10));
	} 
}