package job_project;

public class ReverseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.out.println(ReverseIn(87654321));
	
      Buffer(123456);
	}

	public static int ReverseIn(int num) {
		
    	int rev=0;
	
		while(num!=0)
		{
		rev = rev*10 + num%10;
		num=num/10;
		}
		return rev;
	
		
		
	}
	
	
	static void Buffer(int num) {
	        StringBuffer  sb = new StringBuffer(String.valueOf(num));
		    StringBuffer S   = sb.reverse();
		   System.out.println(S);
	}			
	
	
	

	
	
}

