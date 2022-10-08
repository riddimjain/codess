package Ggettingstartedpnsta;

public class nthtermoffabonicca {
	public static void main (String[]args)
	   {
	     int num = 29;
	     int a = 0, b = 1;
	     int nextTerm=0;
	     for (int i = 2; i < num; i++)
	       {
	       nextTerm = a + b;
	         a = b;
	          b = nextTerm;
	        
	       }
	     System.out.println("Nth term "+nextTerm);
	   }
	 }

