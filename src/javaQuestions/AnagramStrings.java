package javaQuestions;

import java.util.Arrays;

public class AnagramStrings {
	
	//Git Token
	//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

	public static void main(String[] args) {
		//Anagram Strings means if two Strings are made from same characters
		//with same count of characters and length e.g. stop/tops  mary/army
		
		String str1 = "mary";
		String str2 = "amry";
		
		char[] arr1 =str1.toLowerCase().toCharArray();
		char[] arr2 =str2.toLowerCase().toCharArray();
		
		//Sorting is important to make sure characters from both Strings are in same order
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println(str1 + " and "+ str2 +" are anagram");
		}
		else{
			System.out.println(str1 + " and "+ str2 +" are not anagram");
		}

	}	

}
