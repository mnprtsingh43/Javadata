package job_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class MinMaxValueArray {

	public static void main(String[] args) {
     
		int []arr = {1,2,3,56,77,889,-1};
		
		minAndMax(arr);

	}

	
  

public static void Duplicateelements(Object [] n) {
	  
	  
      ArrayList name = new ArrayList(Arrays.asList(n));
     
	  HashSet dup = new HashSet(name);	  
	  ArrayList<Integer> Nname = new ArrayList<Integer>(dup);
	               
	   Object[] ans = Nname.toArray()  ;      
	
	 for ( Object e:ans) {
	System.out.print(e+" ");
	 }
	  
  }

public static void MaxMin (int []n) {
	
	
	       
	int max = Integer.MIN_VALUE;
	int min = Integer.MAX_VALUE;
	
	
	
	for (int e: n) {
		
	if(e>max) {
	
		max = e;	
	}
	if(e<min) {
		min=e;
	}
	
	
}

	System.out.println("Max value of Array " + max +" Min value is " +min);
	
	
}

 static void minAndMax(int[]arr) {
	
	 int MaxValue= arr[0];
	 int MinValue= arr[0];
	
	 for (int e: arr) {
	
		if(e>MaxValue) {
			MaxValue=e;
		}
		else if (e<MinValue) {
			MinValue=e;
		}
	}
	 
System.out.println("Max value of array is "+MaxValue);
System.out.println("Min value of array is "+MinValue);
	 
	 
	 
	 
	 
 }




}
	
	
	
	
	
	
	
	
	
	
	
	

