package javaQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class FindFirstNonRepeatedCharacterInaString {

	public static void main(String[] args) {
		
		//e.g. in "swiss" : w is the first non-repeated character
		String str = "swiss";
		
		//We have used LinkedHashMap here because it maintains the order of the keys
		Map<Character,Integer> charMap = new LinkedHashMap<Character,Integer>();
		
		char[] characters = str.toCharArray();
		for(char ch : characters){
			if(charMap.containsKey(ch)){
				charMap.put(ch, charMap.get(ch)+1);
			}
			else{
				charMap.put(ch, 1);
			}
		}
		
		Set<Character> keys =charMap.keySet();
		for(Character key: keys){
			if(charMap.get(key) == 1 ){
			System.out.println("First non repeated character in String "+ str+ " is : "+key);
			break;
			}
		}

		

	}

}
