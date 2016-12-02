package com.maa;

public class Asterisks {

	public static void main(String[] args) {
		Asterisks asterisks = new Asterisks();
		asterisks.printAstrisks(5);
	}
	
	public void printAstrisks(int count){
		for(int i=0 ; i<count; i++){
			System.out.println("* * * * *");
		}
	}
}
