package job_project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First_Two_max {
/*

	write a code to find first to max values from an array
	
*/	
	public static void main(String[] args) {
	
		int[] ex = {1,2,3,2,4,1};
		
//		Finfit(ex);
		Find_withoutSort(ex);
	}

	
	static void Finfit(int []arr) {
		
	   Arrays.sort(arr);
	   
int a=	   Array.getInt(arr, arr.length-1);
int b=	   Array.getInt(arr, arr.length-2);
		
		
	System.out.println(a);	
	System.out.println(b);	
		
		
	}
	
	static void Find_withoutSort(int []arr)	{
	// 1,2,3,4,3,1
		int fst=0;
		int Snd=0;
		
		for(int e:arr) {
	
			if(fst<e) {
		Snd=fst; 
		fst=e;   
		
	}
	else if (Snd<e){
		Snd=e;
	}
			
			
		}
		System.out.println(fst);
		System.out.println(Snd);
	}

}
	
	
	
	
	
	
	
	
	

