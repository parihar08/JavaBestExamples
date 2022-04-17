package javaQuestions;

import java.util.Random;

public class GenerateRandomNumbersAndStrings {

	public static void main(String[] args) {
		
		//Generate Integer Using Random Class
		Random rand = new Random();
		int randNum = rand.nextInt(10); //We need to provide max limit to pick one random num
		int randNum1 = rand.nextInt(1000);
		System.out.println(randNum);
		System.out.println(randNum1);
		
		//Generate Decimal Numbers using Random Class
		double randNum2 = rand.nextDouble(); //Range: 0.0 to less than 1.0
		System.out.println(randNum2);
		
		//Generate Decimal Numbers(By default) using Math Class
		Double randNum3 = Math.random();
		System.out.println(randNum3);
		
		//Generate Random Numbers and Strings using Apache Commons Lang API
//		String randNum4 = RandomStringUtils.randomNumeric(5);
//		System.out.println(randNum4);
		
//		String randNum5 = RandomStringUtils.randomAlphabetic(5);
//		System.out.println(randNum5);
	}

}
