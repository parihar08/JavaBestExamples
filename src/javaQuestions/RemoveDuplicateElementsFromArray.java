package javaQuestions;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateElementsFromArray {
	
	static String infra[] = {"Amazon","GCP","Azure","Amazon","AliBaba",
			"SauceLabs","Azure","GCP"};
	
    // Function to remove duplicate from array
    public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
  
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
  
        // Print the elements of LinkedHashSet
        System.out.print(set);
    }
	  
	    // Driver code
	    public static void main(String[] args)
	    {
	        int a[] = {5,2,6,8,6,7,5,2,8};
	      
	        // Function call
	        removeDuplicates(a);
	        
	        System.out.println("\n******************");
	        
	        //Using Hash Set
	        Set<String> data = new HashSet<String>();
			for(String e: infra){
				data.add(e);
			}
				System.out.println(data);
			}
	    
	   
	}
	

