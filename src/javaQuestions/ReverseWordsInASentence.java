package javaQuestions;

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
		reversePositionOfWordsInASentence("Welcome to Java"); //Java to Welcome
		
	}

	

}
