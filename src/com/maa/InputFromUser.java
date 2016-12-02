package com.maa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputFromUser {

	public static void main(String[] args) {
		InputFromUser inputFromUser = new InputFromUser();
		inputFromUser.printName();
	}

	public void printName() {
		String pname = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter your name : ");
			pname = br.readLine();
			System.out.println("You Entered : " + pname);
		} catch (IOException e) {
		}
	}
	
}
