package javaQuestions;

public class VowelAndConsonant {

	public static void main(String[] args) {
		
		char c= 'i';
		
		if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
			System.out.println(c +" is a vowel");
		}
		else{
			System.out.println(c +" is a consonant");
		}
		
		System.out.println("********************************");
		
		switch(c){
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println(c +" is a vowel");
			break;
			
		default:
			System.out.println(c +" is a consonant");
			break; 
		}
		
		
	}
	
	

}
