package Ggettingstartedpnsta;

public class perfectnumber {
	  public static void main (String[]args)
	   {

	     int n = 28, sum = 0;

	     for (int i = 1; i < n; i++)
	       {
	     	if (n % i == 0){// checks wheather i is factor of n or not 		
	     	        sum = sum + i;
	     	  System.out.print(i+"  ");
	       }
	       }

	     if (sum == n)//sum of factors is equal to that number
	       System.out.println ("\n "+n + " Is a perfect number");
	     else
	       System.out.println (n + " Is not a perfect number");

	   }
	 

}
