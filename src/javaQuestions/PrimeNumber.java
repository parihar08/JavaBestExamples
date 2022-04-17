package javaQuestions;

public class PrimeNumber {
	
	//Print prime numbers between 1 to n
	public static void printPrimeNumbers(int num){
		
		for(int i=2;i<=num;i++){
			
			boolean isPrime = true;			
			for(int j=2;j<i;j++){
				
				if(i%j==0){
					isPrime = false;
					break;
					}			
				}
			
			if(isPrime){
				System.out.println(i);
			}
		}
		
	}
	
	//Check if given number is prime or not
	public static boolean isPrime(int num){
		
		if(num<1){
			return false;
		}
		for(int i=2;i<num;i++){
			if(num%i==0){
				return false;
			}
		}
		return true;
		
	}
	
	//Print prime numbers between 1 to n using isPrime method written above
	
	public static void getPrimeNumbers(int num){
		for(int i=2;i<=num;i++){
			if(isPrime(i)){
				System.out.println(i+" ");
			}
		}
	}

	public static void main(String[] args) {
		printPrimeNumbers(100);
		System.out.println("***************");
		System.out.println("Is 17 a PrimeNumber? "+isPrime(17));
		System.out.println("Is 21 a PrimeNumber? "+isPrime(21));
		System.out.println("Is 37 a PrimeNumber? "+isPrime(37));
		System.out.println("Is 53 a PrimeNumber? "+isPrime(53));
		System.out.println("Is 88 a PrimeNumber? "+isPrime(88));
		System.out.println("***************");
		getPrimeNumbers(50);
	}
	
	//SQL Inner join on 3 tables
	
	/*SELECT s.studentname
    , s.studentid
    , s.studentdesc
    , h.hallname
	FROM students s
	INNER JOIN hallprefs hp
    on s.studentid = hp.studentid
	INNER JOIN halls h
    on hp.hallid = h.hallid
*/
}
