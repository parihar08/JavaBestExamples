package javaQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElementsInAnArray {
	
	static String infra[] = {"Amazon","GCP","Azure","Amazon","AliBaba",
			"SauceLabs","Azure","GCP"};

	public static void main(String[] args) {
		
		//Brute Force
		
		for(int i=0;i<infra.length;i++){
			for(int j=i+1; j<infra.length; j++){
				if(infra[i] == infra[j]){
					System.out.println(infra[i]);
				}
			}
		}
		
		System.out.println("************************");
		
		//Find Duplicate elements using Sorting
		
		int[] arr = {1,2,3,5,6,3,5,7,1};
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i++){
			if(arr[i] == arr[i+1]){
				System.out.println(arr[i]);
				}
			}	
		System.out.println("************************");
		
		//HashSet
		Set<String> data = new HashSet<String>();
		for(String e: infra){
			if(data.add(e) == false){
				System.out.println(e);
			}
		}
		
		System.out.println("************************");
		
		//HashMap
		Map<String,Integer> inframap = new HashMap<String, Integer>();
		
		for(String e: infra){
			Integer count = inframap.get(e);
			if(count== null){
				inframap.put(e, 1);
			}
			else{
				inframap.put(e, ++count);
				}
				
			}
		
		Set<Map.Entry<String,Integer>> entry = inframap.entrySet();
		for(Map.Entry<String,Integer> e: entry){
			if(e.getValue()>1){
				System.out.println(e.getKey()+ " is present "+ e.getValue() +" times");
			}
		}
		
		System.out.println("************************");
		
		//With Streams
		Set<String> dataSet = new HashSet<String>();
		Set<String> dupSet = Arrays.asList(infra).stream()
				.filter(e -> !dataSet.add(e)).collect(Collectors.toSet());
		System.out.println(dupSet);
		
		}
	
	
		
		

	

}
