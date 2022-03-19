package javaQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersFromString {
	
	public static void getDuplicateCharacters(String str){
		char[] words = str.toCharArray();
		System.out.println(words);  //[vfdewfgerrwrtertesfdsfwef]
		System.out.println("***************************");
		
		HashMap<Character,Integer> charMap = new HashMap<Character,Integer>();
		for(char c:words){
			if(charMap.containsKey(c)){
				charMap.put(c, charMap.get(c)+1);
			}
			else{
				charMap.put(c, 1);
			}
		}
		
		//First Way using KeySet
		Set<Character> set = charMap.keySet();
		for(char c: set)
		{
			System.out.println(c+ " is present "+ charMap.get(c) +" times");
		}
		
		System.out.println("***************************");
		
		//Second Way using EntrySet
		Set<Map.Entry<Character,Integer>> entry = charMap.entrySet();
		for(Map.Entry<Character,Integer> e: entry){
			if(e.getValue()>1){
				System.out.println(e.getKey()+ " is present "+ e.getValue() +" times");
			}
		}
		
		
	}

	public static void main(String[] args) {
		getDuplicateCharacters("vfdewfgerrwrtertesfdsfwef");

	}

}
