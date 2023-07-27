package job_project;

import java.util.Set;
import java.util.TreeSet;

public class Firstrepeated_Array {

	public static void main(String[] args) {
		int []a = {1,5,3,1,5,1};
		String b= "aaaabbbbbcddddeeeefffff";
	
		hashch(b);

	}

	
	
		
	static void hash(int arr[]) {
		

		Set<Integer> stt = new TreeSet<Integer>();
		
	for (int e:arr) {
		
		if (!stt.add(e)) {
		System.out.println("First non-Repeated---------------> "+e);
		break;	
		
		}
	}
	}		
		
	static void hashch(String a) {
	
         char[] c  =a.toCharArray();
		          
        
         Set<Character> stt = new TreeSet<Character>();
 		
     	for (char e:c) {
     		
     		if(!stt.add(e)) {
     			System.out.println(e);
     			break;
     		}
     		
     	}
     	System.out.println(stt);
		
	}
	
	
	
	
	

	
	
	
	
	
}

	
	

