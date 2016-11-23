package com.maa;

public class GenerateNumbers {
	

	public void numbers(){
		for (int i=0; i<10; i++){
			System.out.println(i+1);
		}
	}
	
	public void evenNumbers(){
		for (int i=0; i<10; i++){
			if(i%2==0){
				System.out.println(i);
			}
		}
	}
	
	public void oddNumbers(){
		for (int i=0; i<10; i++){
			if(i%2==1){
				System.out.println(i);
			}
		}
	}
	
	
	public static void main (String[] args){
		GenerateNumbers generateNumbers = new GenerateNumbers();
		System.out.println("Printing Numbers");
		generateNumbers.numbers();
		System.out.println("Printing Even Numbers");
		generateNumbers.evenNumbers();
		System.out.println("Printing Odd Numbers");
		generateNumbers.oddNumbers();
	}
	
}
