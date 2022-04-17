package javaQuestions;

import java.util.Scanner;

public class ReverseANumber {
	
	//Using loop
	public static void reverseNumber(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int rev= 0;
		
		while(num>0){
			rev = rev*10 + num%10;
			num = num/10;
		}
		System.out.println("Reverse Number is: "+ rev);
		
	}
	
	//Using StringBuffer
	public static StringBuffer stringBufferReverse(int num){
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		return sb.reverse();
	}
	
	//Using StringBuilder
	public static StringBuilder stringBuilderReverse(int num){
		StringBuilder sbl = new StringBuilder();
		return sbl.append(num).reverse();
	}
	

	public static void main(String[] args) {
		reverseNumber();  //input 4576    RevNum 6754
		System.out.println("******************");
		System.out.println(stringBufferReverse(36898));
		System.out.println("******************");
		System.out.println(stringBuilderReverse(4536435));
	}

}
