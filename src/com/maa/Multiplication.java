package com.maa;

public class Multiplication {

	public static void main(String[] args) {
		Multiplication multiplication = new Multiplication();

		for(int i=0; i<100; i++){
			System.out.println("Mutlitiplication Table of  : " +  (i+1));
			multiplication.generateMultiplicationTable(i+1);
			System.out.println("");
		}
	}

	public void generateMultiplicationTable(int number) {
		for (int y = 1; y <= 10; y++) {
			int product = (number * y);
			System.out.println(number + " x " + y + " = " + product);
		}
	}

}