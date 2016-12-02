package com.maa;

public class AsterisksIncrement {

	public static void main(String[] args) {
		AsterisksIncrement asterisksincrement = new AsterisksIncrement();
		asterisksincrement.printAstrisksIncrement(100);
	}

	public void printAstrisksIncrement(int count) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}