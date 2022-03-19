package javaQuestions;

public class ReverseAString {
	
	public static String stringReverse(String str){
		int len = str.length();
		String rev_str = "";
		
		for(int i=len-1;i>=0;i--){
			rev_str = rev_str + str.charAt(i);
		}
		return rev_str;
	}
		
	//Using String Buffer
	public static void stringReverseUsingBuffer(String str){
	
		StringBuffer sf = new StringBuffer(str);
		System.out.println(sf.reverse());
	}

	public static void main(String[] args) {
		System.out.println(stringReverse("sandeep dolly"));
		
		//Using String Buffer
		stringReverseUsingBuffer("dolly sandeep");
		
		
	}

}
