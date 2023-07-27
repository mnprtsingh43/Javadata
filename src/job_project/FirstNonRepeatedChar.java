package job_project;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
	 	
   String a = "SWiss";
   
   NonRepeated(a);
		
	}
// we use Linked hashmap because it maintains insertion order	

	
   static void NonRepeated(String str1) {
	  String str= str1.toLowerCase();
	
	  int count=1;
	 
	Map < Character,Integer> mp = new LinkedHashMap <Character,Integer>();
	  
	for(int i=0 ; i< str.length();i++) {
	 if(!mp.containsKey(str.charAt(i))) {
		 mp.put(str.charAt(i), count);
	 }
	 else {
		 mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
	 }
	}	
	 System.out.println(mp);
	 
	 for(  Entry <Character,Integer>  entry : mp.entrySet()) {
		 
	if (entry.getValue()==1)
	{
		System.out.println("First non repeated char -------> "+entry.getKey());
		break;
	}
	 }
	   
 
   }
   
}	
	
	
	
	
	
	
	

