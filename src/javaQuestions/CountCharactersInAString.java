package javaQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountCharactersInAString {

	//Using str.charAt(i) method
	public static int getCharacterOccurence(String str, char c){
		int len = str.length();
		int count= 0;
		
		for(int i=0;i<len;i++){
			if(str.charAt(i)==c){
				count++;
			}		
		}
		return count;
		
	}
	
	//Using str.toCharArray method
	public static int getCharacterOccurence1(String str, char c){
		int count=0;
		for(char ch: str.toCharArray()){
			if(ch==c){
				count++;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
		//Using str.charAt(i) method
		System.out.println(getCharacterOccurence("fsffrewewfewqwdefwe", 'e'));
		
		//Using str.toCharArray method
		System.out.println(getCharacterOccurence1("vdsghrwqfqdferqeffrewr", 'f'));
		
		//Using Lambda
		String str = "dsfsdgseesdgsfsa";
		List<String> characters = Arrays.asList(str.split(""));
		Map<String, Long> map = characters.stream()
			    .filter(s -> s.equalsIgnoreCase("a"))
			    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		map.entrySet().stream().forEach(i-> System.out.println(i));
		

	}

}
