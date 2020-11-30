package com.rsc.babystepprogram;

public class JavaScientificCalculator {
	public int add(int a,int b) {
		return a+b;
	}
	public float divide(int a,int b) {
		return (float)a/b;
	}
	public float squareroot(float a) {
		return (float) Math.sqrt(a);
	}
	public float cuberoot(float a) {
		return (float) Math.cbrt(a);
	}
	public double tan(double d) {
		double radians = Math.toRadians(d);
		return Math.tan(radians);
	}
	public double cos(double d) {
		double radians = Math.toRadians(d);
		return Math.cos(radians);
	}
	public static void main(String[] args) {
		JavaScientificCalculator jsc = new JavaScientificCalculator();
		System.out.println("Summation of 5 and 2==> " + jsc.add(5, 2));
		System.out.println("Divide of 5 and 2==> " + jsc.divide(5, 2));
		System.out.println("Square Root of 9==>" + jsc.squareroot(9));
		System.out.println("Square Root of 3==>" + jsc.squareroot(3));
		System.out.println("Cube Root of 6==>" + jsc.cuberoot(6));
		System.out.println("Tan of 45==>" + jsc.tan(45));
		System.out.println("Cos of 45==>" + jsc.cos(45));
		System.out.println("Value of PI(22/7)==>" + Math.PI);
		System.out.println("Complete");

		
	}

}