package Ggettingstartedpnsta;

public class primefactor {
	public static void main(String[]arsg) {
		int num=90;
		for(int i = 1; i <= num; i++)
		   {
		       if(num % i == 0){// % gives remainder
		           if(isPrime(i)) {
		        	   System.out.println(i);
		     	   
		   }
		}
		   }
	}
	
	static boolean isPrime (int n)
	   { 
	     if (n < 2)
	       return false;
	     for (int i = 2; i < n; i++)
	     if (n % i == 0)
	        return false;
	      return true;
	   }
	 

}
