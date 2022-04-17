package javaQuestions;

public class CountOddEvenDigitsInANumber {
	
	public static void evenOddDigitCount(int num){
		
		int even_count=0;
		int odd_count=0;
		
		
		while(num>0){
			
			int rem = num%10;
			
			if(rem%2 ==0){
				even_count++;
			}
			else{
				odd_count++;
			}
			num = num/10;
		}
		System.out.println("Even count is: "+even_count);
		System.out.println("Odd count is: "+odd_count);
		
	}
	

	public static void main(String[] args) {
		evenOddDigitCount(2532323);

	}

}
