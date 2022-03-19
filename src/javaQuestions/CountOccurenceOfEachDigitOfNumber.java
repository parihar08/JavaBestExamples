package javaQuestions;

import java.util.HashMap;
import java.util.Set;

public class CountOccurenceOfEachDigitOfNumber {
	
	public static void getDigitCount(long number){
		
		HashMap<Long, Integer> digitMap = new HashMap<Long, Integer>();
		while(number >0){
			long lastDigit = number%10;
			if(digitMap.containsKey(lastDigit)){
				digitMap.put(lastDigit, digitMap.get(lastDigit)+1);	
			}
			else{
				digitMap.put(lastDigit, 1);
			}
			number = number/10;
		}
		
		//Print the counts
		Set<Long> keys = digitMap.keySet();
		for(Long key: keys){
			System.out.println(key+ " is present "+ digitMap.get(key) +" times");
		}
		
	}

	public static void main(String[] args) {
		getDigitCount(534524242);
		
// 		  long num1 = 323543529;
//        List<char[]> stringList = Arrays.asList(str1.toCharArray());
//        
//        Map<Character, Long> map = stringList.stream()
//            .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
//        
//        map.entrySet().stream().forEach(i-> System.out.println(i));

	}

}
