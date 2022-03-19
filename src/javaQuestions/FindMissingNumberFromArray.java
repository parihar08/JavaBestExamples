package javaQuestions;

public class FindMissingNumberFromArray {

	public static void main(String[] args) {
		
		int[] num = {1,2,3,5,6,7,8,9,10};
		int expected_sum = 0;
		int actual_sum = 0;
		for(int i=1;i<=10;i++){
			expected_sum = expected_sum + i;
		}
		for(int j=0;j<num.length;j++){
			actual_sum = actual_sum + num[j];
		}
		System.out.println(expected_sum);
		System.out.println(actual_sum);
		System.out.println("Missing number is: "+ (expected_sum-actual_sum));
	}

}
