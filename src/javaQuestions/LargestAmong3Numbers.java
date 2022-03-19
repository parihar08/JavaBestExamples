package javaQuestions;

public class LargestAmong3Numbers {

	public static void main(String[] args) {
		
		int x =300;
		int y =400;
		int z= 100;
		
		if(x>y && x>z){
			System.out.println("x is the greatest");
		}
		
		else if(y>z){
			System.out.println("y is the greatest");
		}
		
		else{
			System.out.println("z is the greatest");
		}

		System.out.println("********************************");
		
		if(x>=y){
			if(x>=z){
				System.out.println("x is the greatest");				
			}
			else{
				System.out.println("z is the greatest");
			}
					}
		else if(y>=z){
			System.out.println("y is the greatest");		
		}
		else{
			System.out.println("z is the greatest");
		}
			
			}
	

}
