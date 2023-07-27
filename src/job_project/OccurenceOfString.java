package job_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class OccurenceOfString {

	public static void main(String[] args) {

   
		String s = "Siwss";
		
		String[] AfterSplit =  s.toLowerCase().split("");
		
		
   Map< String , Integer>  Ref = new LinkedHashMap < String , Integer> ();
		
	for(String c: AfterSplit) {
	
		if (Ref.containsKey(c)) {
				Ref.put(c, Ref.get(c)+1) ;
	}
	   else {
			Ref.put(c, 1);	
	}
}	
System.out.println(Ref);

// this can be used for non repeated char
 for(  Entry <String,Integer>  entry : Ref.entrySet()) {
	 
	if (entry.getValue()==1)
	{
		System.out.println("First non repeated char -------> "+entry.getKey());
		break;
	}
	
	
		
	}

	}
}

	
	
	
	
	
		
		
	
	
	
	
	
	
	
		
		
		

	

	


