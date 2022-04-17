package javaQuestions;

public class Factorical {
	
	public static long printFactorial(int num){
		
		long fact=1;
		while(num>0){
			fact= fact*num;
			num = num-1;
		}
		return fact;
	}
	
	public static long printFactorial1(int num){
		
		long fact=1;
		for(int i=1;i<=num;i++){
			fact= fact*i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(printFactorial(5));
		System.out.println("*******************");
		System.out.println(printFactorial1(8));
	}

}
