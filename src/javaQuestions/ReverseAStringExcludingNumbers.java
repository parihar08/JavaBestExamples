package javaQuestions;

import java.util.Arrays;

public class ReverseAStringExcludingNumbers {
	
	public static void stringReverseExcludingNumbers(String str){
		String[] words = str.split("((?<=[a-zA-Z])(?=[0-9]))|((?<=[0-9])(?=[a-zA-Z]))");
		System.out.println(Arrays.toString(words));
//		String[] numbers = str.split("[^A-Z0-9]+|(?<=[A-Z])(?=[0-9])|(?<=[0-9])(?=[A-Z])");
//		System.out.println(Arrays.toString(numbers));
		String revStr = "";
	
		for(String word: words)
		{
			String revWord = "";
			for(int i=word.length()-1; i>=0;i--)
				{
					if(Character.isAlphabetic(word.charAt(i)))
						{
							revWord = revWord+ word.charAt(i);
						}
					else{
						revWord = word;
					}
			}
			revStr = revStr+revWord;
	}
		System.out.println("Reversed string for "+str+" : "+revStr);
	}

	public static void main(String[] args) {
	stringReverseExcludingNumbers("test12pop90java989pyt"); //tset12pop90avaj989typ


	}

}
