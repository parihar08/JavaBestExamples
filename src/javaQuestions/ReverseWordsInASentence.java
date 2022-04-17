package javaQuestions;

import java.util.Arrays;

public class ReverseWordsInASentence {
	
	public static void reverseWordsInASentence(String str){
		
		String[] words = str.split(" ");
		String revStr = "";
		
		for(String word: words)
		{
			String revWord = "";
			for(int i=word.length()-1; i>=0;i--)
			{
				revWord = revWord+word.charAt(i);
			}
			revStr = revStr+revWord+ " ";
		}
		System.out.println("Reversed string for "+str+" : "+revStr);
	}
	
	//Using StringBuilder
	public static void reverseWordsInASentenceUsingStringBuilder(String str){
		
		String[] words = str.split(" ");
		String revStr = "";
		
		for(String word: words)
		{
			StringBuilder sb = new StringBuilder(word);
			sb.reverse();
			
			revStr = revStr+sb.toString()+ " ";
		}
		System.out.println("Reversed string for "+str+" : "+revStr);
	}
	
	public static void reversePositionOfWordsInASentence(String str){
		String[] words= str.split(" ");
		String result = "";
		for(int i=words.length-1;i>=0;i--){
			result = result + words[i] + " ";
		}
		System.out.println("Reversed position of words for string  "+str+" : "+result);
	}

	public static void main(String[] args) {
		reverseWordsInASentence("Welcome to Java"); // emocleW ot avaJ
		System.out.println("*****************");
		
		reverseWordsInASentenceUsingStringBuilder("Welcome to Java"); // emocleW ot avaJ
		System.out.println("*****************");
		
		reversePositionOfWordsInASentence("Welcome to Java"); //Java to Welcome
		System.out.println("*****************");
		
		//Using Streams
		String name = "welcome to java";
        Arrays.stream(name.split(" "))
                .forEach(word -> {
                    String reverse = "";
                    reverse = reverse + new StringBuilder(word).reverse();
                    System.out.print(reverse + " ");
                });
		
	}

	

}
