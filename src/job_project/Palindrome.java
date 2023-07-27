package job_project;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Palindrome {

	public static void main(String[] args) {
		int [] num = {1,2,3,6,7,8};
	    System.out.println(missingNum(num));
}
	
 static void SwapTwoVariables (int x, int y) {
	 
	 x= x+y ;
	 y=x-y ;  // y=x
	 x=x-y ;  // y
	 
	 System.out.println(x);
	 System.out.println(y);
} 
	
 static void FebSeries(int count){
	 
	 int a=0;
	 int b=1;
	 int c=1;
	 
	 for (int i=0; i<=count ;i++) {
		 
		 System.out.print(a+",");
		 a=b;
		 b=c;
		 c=a+b;
		 
	 }
	 
	 
	 
	 
 }
	
	
          static boolean Palindrome(String str){
	
     // Palindrome means if we read string from right to left or left to right it is same  	  
   
     //Encrusion method
       
        	      if(str.equals("")){
        	    	return true;  
        	    	  }
        	    	if(str.length()<=1) {
        	    	return true;
        	    	}
       
        	 String First   = str.substring(0,1);
             String Last   = str.substring(str.length()-1,str.length());
        	                
   if (!First.equals(Last)) {
	  return false; 
   }
   else {
	   return Palindrome(str.substring(1, str.length()-1));
   }
        	  
        	  
        
        	  
        	  
        	  
        	  
}
	
          public static Set<Integer> missingNum(int num[]) {
      		
        	  
        	Arrays.sort(num);

      		Set<Integer> actualSet = new TreeSet<Integer>();
			
			  for (Integer e : num)
			  { actualSet.add(e);
			  }
			 

      		Set<Integer> expectedSet = new TreeSet<Integer>();
      		for (int i = num[0]; i <= num[num.length - 1]; i++) {
      			expectedSet.add(i);
      		}

      		expectedSet.removeAll(actualSet);

      		return expectedSet;
      	}
	
	
	

}
