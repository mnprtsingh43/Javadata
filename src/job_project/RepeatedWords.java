package job_project;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RepeatedWords {

	public static void main(String[] args) {
//		HashsetUse("nnnnnnnhhhhhjjjjjjooo");
//		repeat_char_remove_only("bbbcccasaafff");
		
	repeat_char_remove_only("aaabbbbcdddd");

	}
	
     static void repeat_char_remove_only(String s) {
	
	       StringBuilder sb = new StringBuilder();
	       
	     for (int i=0; i<s.length();i++) {
	    
	    	  char ch  = s.charAt(i);
	    	  int idx  = s.indexOf(ch, i+1);
	 
	    	  if (idx==-1) {
	    		 // sb.append(ch);
	             s.replace(ch, '');
	    }
	    	  
//	    else {
//	    	sb.append(ch);
//	    }
	     } 
	     System.out.println(sb);
	       
	      }
     
     
	
	static void HashsetUse(String  s) {
		      char[] st         = s.toCharArray();
	//	  StringBuilder sb = new StringBuilder();    
		      
		Set <Character>ref = new HashSet<Character>();
		for (char c:st) {
			ref.add(c);
		}	
		
		       Iterator<Character> it      =  ref.iterator();
		
		       while(it.hasNext()) {
		    	System.out.print(it.next());
		       }
		
		 
		              
	}
	
	
	
	
	

	
		   
	   
		
static void NonRepeated(String str1) {
	  
	String str= str1.toLowerCase();
	
	  int count=1;
	
	  Map < Character,Integer> mp = new ConcurrentHashMap <Character,Integer>();
	  
	for(int i=0 ; i< str.length();i++) {
	 if(!mp.containsKey(str.charAt(i))) {
		 mp.put(str.charAt(i), count);
	 }
	 else {
		 mp.put(str.charAt(i), mp.get(str.charAt(i))+1);
	 }
	}	
	 System.out.println("Before removing it"+mp);
	 
	 StringBuilder sb = new StringBuilder();
	 
	 for(  Entry <Character,Integer>  entry : mp.entrySet()) {
		 
	if (entry.getValue()==1)
	{
		
       mp.remove(entry.getKey(),entry.getValue());
	}
	else {
	continue;
	}
 }
     
}

}
	



 
		
		
	
	
	
	
	
	
	
	
	
	
	

