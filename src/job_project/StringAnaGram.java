package job_project;

import java.util.Arrays;

public class StringAnaGram {

	// Anagram means any two string with same length and same no of characters
	// i.e Stops and  Posts
	
	
	public static void main(String[] args) {
	
		String a = "Army";
		String b = "Maryi";
		
		Anagram(a,b);

	}


	public static void Anagram(String Str1,String Str2) {
		
char[]	Arr1 = Str1.toLowerCase().toCharArray();
char[]	Arr2 = Str2.toLowerCase().toCharArray();		
		
Arrays.sort(Arr1);
Arrays.sort(Arr2);

if (Arrays.equals(Arr1, Arr2)) {
	System.out.println("String is ANAGRAM");
}
else {
	System.out.println("String is't ANAGRAM");
}

		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	

