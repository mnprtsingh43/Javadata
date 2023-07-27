package job_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveEvenOddNumbers {
  
	
	 static void pmethod() {
	System.out.println("Method of Parent class");
	
	}
	

	
	public static void main(String[] args) {
		
	
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		
		
		System.out.println(list); 
		
		list.removeIf(num -> num%2 == 0);
		
		System.out.println(list);
		
	

	}
}