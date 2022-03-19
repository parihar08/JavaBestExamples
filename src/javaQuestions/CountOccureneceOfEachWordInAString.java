package javaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOccureneceOfEachWordInAString {

	public static void main(String[] args) {
		
		String str = "I am am learning learning learning java java java java programming";
		
		HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
		
		String[] words =str.split(" ");
		
		for(String word: words){
			if(wordMap.containsKey(word)){
				wordMap.put(word, wordMap.get(word)+1);
			}
			else{
				wordMap.put(word, 1);
			}
			
		}
		
		Set<String> keys=wordMap.keySet();
		for(String key: keys){
			System.out.println("The count of word :"+key + " = " +wordMap.get(key));
		}
		
		System.out.println("*************************");
		
		//Using Streams:
		
		String str1 = "I am learning java java programming ja ja";
        List<String> stringList = Arrays.asList(str1.split(" "));
        Map<String, Long> map = stringList.stream()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        map.entrySet().stream().forEach(i-> System.out.println(i));

	}

}
