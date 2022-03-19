package javaQuestions;

public class ExtractSomePartsOfTheString {

	//extract last n number of characters from String	
	public static void extractString(String str, int numberOfChar){
		String newString = "";
		int len = str.length();
		for(int i=len-numberOfChar;i<=len-1;i++){
			newString = newString+str.charAt(i);
		}
		System.out.println(newString);

	}

	public static void main(String[] args) {

		extractString("JavaProgramming", 4);
		extractString("This is a test string", 6);
		extractString("Sandeep Parihar", 2);
		extractString("Dolly Minhas", 12);
		extractString("www.facebook.com", 8);
		
		//Another way using sub string
		System.out.println("**************");
		String str2 = "www.facebook.com";
		String firstFour = str2.substring(0,4);
		//print first 4 characters of string
		System.out.println(firstFour);
		String lastFour = str2.substring(str2.length()-4,str2.length());  
		//print last 4 characters of string
		System.out.println(lastFour);

	}

}
