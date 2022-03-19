package javaQuestions;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class First3CharactersOfWeekDays {

	public static void main(String[] args) {
		String[] input = {"Sunday","Monday","Tuesday","Wednesday", "Thursday",
				"Friday","Saturday"};
		//We use LinkedHashset since it maintains the order
		Set<String> outputSet = new LinkedHashSet<String>();
		for(String str: input){
			outputSet.add(str.substring(0,3));
		}
		System.out.println(Arrays.toString(input)); //to print String Array
		System.out.println(outputSet);
		

	}

}
