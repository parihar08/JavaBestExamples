package javaQuestions;

public class PalindromeString {
	
	public static void checkPalindrome(String str){
		String s1 = str;
		String s2 = "";
		int len = s1.length();
		for(int i=len-1;i>=0;i--){
			s2 = s2 + s1.charAt(i);
		}
		if(s2.equals(str)){
			System.out.println(str+" is a Palindrome String");
		}
		else{
			System.out.println(str+" is not a Palindrome String");
		}
}
	//Using Recursion
	//Compare first character from beginning and first from last
	//Compare second character from beginning and second from last and so on..
	public static boolean checkPalindromeRecursion(String str1){
		if(str1==null){
			return false;
		}
		if(str1.length()<=1){
			return true;
		}
		String first = str1.substring(0,1);
		String last = str1.substring(str1.length()-1, str1.length());
		if(!first.equals(last)){
			return false;
		}
		else{
			return checkPalindromeRecursion(str1.substring(1, str1.length()-1));
		}
	}

	public static void main(String[] args) {
		checkPalindrome("madam");
		checkPalindrome("sandeep");
		checkPalindrome("nitin");
		System.out.println("********************");
		System.out.println(checkPalindromeRecursion("madam"));
		System.out.println(checkPalindromeRecursion("sandeep"));
		System.out.println(checkPalindromeRecursion("mamamam"));

	}

}
