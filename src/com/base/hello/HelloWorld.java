package com.base.hello;

public class HelloWorld {

	public static void main(String[] args) {
		int num1 = 5;
		int num2 = 8;
		
		int total = add(num1, num2);
		
		System.out.println("The total is "  + total);
	}
	
	public static int add(int first, int second) {
		int sum = first + second;
		return sum;
	}
}
