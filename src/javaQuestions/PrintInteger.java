package javaQuestions;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		
		int num = reader.nextInt();
		
		System.out.println("User has entered: "+num);
		
		reader.close();

	}

}
