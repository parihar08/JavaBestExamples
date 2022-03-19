package javaQuestions;

import java.util.HashMap;
import java.util.Set;

public class DuplicateWordsFromASentence {
	
	public static void findDuplicateWords(String str){
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		String[] words= str.split(" ");
		
		for(String word: words){
			if(wordMap.containsKey(word)){
				wordMap.put(word, wordMap.get(word)+1);
				}
			else{
				wordMap.put(word, 1);
			}
		}
		
		Set<String> keys = wordMap.keySet();
		for(String key: keys){
			if(wordMap.get(key)>1){
				System.out.println("Duplicate word "+key+
						" occurs "+wordMap.get(key)+ " times");
			}
		}
		
	}

	public static void main(String[] args) {
		findDuplicateWords("This is is a test test test a a a a a a a");

	}

}
