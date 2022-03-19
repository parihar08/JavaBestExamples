package javaQuestions;

import java.util.Arrays;

public class LargestAndSmallestInAnArray {

	public static void main(String[] args) {
		 Integer[] arr = {100,200,300,400,500,700,800};
		 int max = arr[0];
		 for(int i=0;i<arr.length;i++){
			 if(arr[i] > max){
				 max= arr[i];
			 }
		 }
		 System.out.println("Maximum element in array "+Arrays.toString(arr)+" is: "+max);
		 
		 int min = arr[0];
		 for(int j=0;j<arr.length;j++){
			 if(arr[j] < min){
				 min= arr[j];
			 }
		 }
		 System.out.println("Maximum element in array "+Arrays.toString(arr)+" is: "+min);
	}

}
