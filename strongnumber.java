package Ggettingstartedpnsta;

public class strongnumber {
public static void main(String args[]) {
	     int num = 145;
	     int digit, sum = 0;
	     int temp = num;
	     // calculate 1! + 4! + 5!
	     while (temp != 0)
	       {
	     	digit = temp % 10;
	     	sum = sum + facto (digit);
	 	    temp /= 10;
	       }
	     if (sum == num)
	       System.out.print("strong number");
	     else
	    	 System.out.print(" not strong number");

}
	     // function to calculate factorial
		   static int facto (int n)
		   {
		     int fact = 1;
		     
	            while(n!=0) {
	              fact=fact*n;
	              n--;
	               	}
		      
		     return fact;
		   }
	 }
