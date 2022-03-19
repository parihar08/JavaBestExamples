package javaQuestions;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountOccurenceOfEachCharacterInaString {

	
	public static void characterCount(String inputString){
		// Creating a HashMap containing char as a key and occurrences as  a value
		HashMap<Character,Integer> charCountMap = new HashMap<Character, Integer>();	
		
		// Converting given string to char array
		
		char[] strArray = inputString.toCharArray();
		
		// checking each char of strArray
		for(char c: strArray){
			if(charCountMap.containsKey(c)){
				// If char is present in charCountMap,incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c)+1);
			}
			// If char is not present in charCountMap,putting this char to charCountMap with 1 as it's value
			else{
				charCountMap.put(c, 1);
			}
		}
		
		// Printing the charCountMap using entrySet
		for(Map.Entry<Character,Integer> entry: charCountMap.entrySet()){
			System.out.println(entry.getKey() + "  "+entry.getValue());
		}
		
		System.out.println("**********************");
		// Printing the charCountMap using keySet
		
		Set<Character> keys = charCountMap.keySet();
		for(Character key: keys){
			System.out.println(key + " "+charCountMap.get(key));
		}
	}
	
	public static void main(String[] args) {
		String str = "sandeep singh parihar";
		characterCount(str);
		
		System.out.println("******************");
		
		String str2 = "aabbbccccdeeeee";
		characterCount(str2);
		
		System.out.println("******************");
		
		//Using Lambda expression
		
		String str1 = "I am learning java java programming ja ja";
        //List<char[]> stringList = Arrays.asList(str1.toCharArray());
        List<Character> stringList = new ArrayList<Character>();
        for (char c : str1.toCharArray()) 
        {
        	stringList.add(c);
        	}
        
        System.out.println(str1.toCharArray()); //prints the string str1
        System.out.println(stringList); //[I,  , a, m,  , l, e, a, r, n, i, n, g,  , j, a, v, a,  , j, a, v, a,  , p, r, o, g, r, a, m, m, i, n, g,  , j, a,  , j, a]
        
        Map<Character, Long> map = stringList.stream()
            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        
        System.out.println(map); //{ =7, a=9, e=1, g=3, i=2, I=1, j=4, l=1, m=3, n=3, o=1, p=1, r=3, v=2}
        
        System.out.println("******************");
        
        map.entrySet().stream().forEach(i-> System.out.println(i));
        
        System.out.println("******************");
        
       //Using Lambda expression2
        
        String str4 = "I am learning java java programming ja ja";
		List<String> characters = Arrays.asList(str4.split(""));
		Map<String, Long> map1 = characters.stream()
			    .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
		map1.entrySet().stream().forEach(i-> System.out.println(i));
        
	}

}
