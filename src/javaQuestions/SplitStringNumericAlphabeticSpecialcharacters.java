package javaQuestions;

public class SplitStringNumericAlphabeticSpecialcharacters {
	
	public static void splitString(String s){
		
		StringBuffer alpha = new StringBuffer(),
				num = new StringBuffer(),
				spe = new StringBuffer();
		
		int len = s.length();
		
		for(int i=0;i<len;i++){
			if(Character.isDigit(s.charAt(i))){
				num.append(s.charAt(i));
			}
			else if(Character.isAlphabetic(s.charAt(i))){
				alpha.append(s.charAt(i));
			}
			else
				spe.append(s.charAt(i));
		}
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(spe);
	}
	
	
	
	public static void main(String[] args) {
		String str = "geeks01$$for02geeks03!@!!";
        splitString(str);
	}
	
	

}
