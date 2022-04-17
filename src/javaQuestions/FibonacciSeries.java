package javaQuestions;

public class FibonacciSeries {
	
	public static void printFibonacci(int range){
		
		int n1=0;
		int n2=1;
		int sum=0;
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<range;i++){
			sum = n1+n2;
			System.out.print(" "+sum); //Remove ln to print all numbers in same line
			n1 = n2;
			n2 = sum;
		}
	}
	
	
	public static void main(String[] args){
		printFibonacci(10);		//0 1 1 2 3 5 8 13 21 34
		System.out.println("*********************");
		printFibonacci(20);		//0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181
	}

}
