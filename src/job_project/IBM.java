package job_project;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class IBM {

	public static void main(String[] args) {
		// find occurence
		 Mth("This is many many times times times many tim");
		
		

	}
	
	public static void Mth(String s) {
		
		    String[] Words=s.split(" ");
	              Set word= new HashSet();
	     
	        for (String e: Words) {
	        	if (word.add(e)) {
	        		
	        	}
	        	else {
	        		System.out.println(e);
	        	}
	        		
	        }
	    
   
		
		
	}
	
	
}
