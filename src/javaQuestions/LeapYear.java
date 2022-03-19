package javaQuestions;

public class LeapYear {

	public static void main(String[] args) {
		
		//Divisible by 4 for all the century years (ending with 00s)
		
		//Century year is a leap year only when its perfectly divisible by 400
		
		//1900 is not a leap year
		//2012 is a leap year
		
		int year = 2021;
		boolean leap = false;
		
		if (year % 4 == 0){
			if(year % 100 == 0){
				if(year % 400== 0){
					leap = true;
								}
				else{
					leap = false;
				}
							}
			else{
				leap=true;
				}
					}
		else{
			leap= false;
		}
		
		if(leap){
			System.out.println(year +" is a leap year");
		}
		else{
			System.out.println(year +" is not a leap year");
		}
	}

}
