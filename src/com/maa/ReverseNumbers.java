package com.maa;

public class ReverseNumbers {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println("The value of x = " + x);
		System.out.println("The value of y = " + y);
		
		int temp=x;
		x=y;
		y=temp;
		
		System.out.println("");
		
		System.out.println("The value of x = " + x);
		System.out.println("The value of y = " + y);
		
		
	}
}