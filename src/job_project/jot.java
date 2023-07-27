package job_project;
import java.util.Scanner;
public class jot
{
    public static void main(String[] args) {
    	  int n, count =0,a,b,c,sum=0;
          System.out.println("Armstrong numbers from 1 to 500:");
          for(int i =1; i<=200; i++)
          {
              n=i;
              while(n >0)
              {
                  b=n % 10;
                  sum =sum +(b*b*b);
                  n =n/10;
              }
              if(sum==1){
                  System.out.print(i+"");
              }
              sum =0;
             
          }
          {
              int even=0, odd=0;
              for(int i =1; i<=100; i++ ){
                  if(i % 2 ==0)
                  {
                      even+=i;
                  }
                  else
                  {
                      odd+=i;
                  }
              }
             
          }
      }
  
    }
