package javaQuestions;

public class RemoveAllWhiteSpacesFromString {


	public static void main(String[] args) {
		String str = "      Geeks     for    Geeks        ";
	       
        // Call the replaceAll() method
        str = str.replaceAll("\\s", "");
       
        System.out.println(str);

	}

}
