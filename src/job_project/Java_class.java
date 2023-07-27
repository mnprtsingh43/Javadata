package job_project;

public class Java_class {

	public static void main(String[] args) {

		

	}

// write a java code to find Fibonacci series output 1,1,2,3,5,8....
	
	public static void fibonacci(int n) {
		int first=1;
		int second =1;
		int third= first+second;
		
		for (int i=1;i<=n;i++) {
			System.out.println("Fibonacci series"+"----->"+ +first+".");
			first=second;
			second=third;
			third= first+second;
		}
	}
		public static int fibonaccRecursioni(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		return 	fibonaccRecursioni(n-1)+fibonaccRecursioni(n-2);
			
		}
		
		
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
