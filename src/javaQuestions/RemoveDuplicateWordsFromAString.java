package javaQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateWordsFromAString {

	public static void main(String[] args) {
		
		String str = "Java is is is object object oriented language";
		String stringWithoutDuplicates = "";
		//We used LinkedHashSet over HashSet since it maintains the order of the words in the String
		LinkedHashSet<String> setWithoutDuplicates = new LinkedHashSet<String>();
		
		String[] wordsArray = str.split(" ");
		for(String word: wordsArray){
			setWithoutDuplicates.add(word);
		}
		for(String word: setWithoutDuplicates){
			stringWithoutDuplicates = stringWithoutDuplicates + word + " ";
		}
		
		System.out.println(setWithoutDuplicates);
		System.out.println(stringWithoutDuplicates);
		
		System.out.println("**************************");
		
		//Using Streams
		String str1 = "Java is object object oriented language";
        List<String> words = Arrays.asList(str1.split("\\s+"));
        String strWithoutDuplicates = words.stream()
            .distinct()
            .collect(Collectors.joining(" "));
        System.out.println(strWithoutDuplicates);
	}

}
