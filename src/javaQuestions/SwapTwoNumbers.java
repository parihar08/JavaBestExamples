package javaQuestions;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		int a= 10;
		int b =20;
		
		System.out.println("Before Swapping: ");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		System.out.println("********************************");

		int temp;
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("After Swapping: ");
		System.out.println("Value of a: "+a);
		System.out.println("Value of b: "+b);
		
		System.out.println("********************************");
		
		int c= 30;
		int d =40;
		
		System.out.println("Before Swapping: ");
		System.out.println("Value of c: "+c);
		System.out.println("Value of d: "+d);
		
		System.out.println("********************************");
		
		c= c-d;
		d= c+d;
		c= d-c;
		
		System.out.println("After Swapping: ");
		System.out.println("Value of c: "+c);
		System.out.println("Value of d: "+d);
		
		
	}

}
