package Ggettingstartedpnsta;
import java.util.Scanner;
public class PRIMENUMINRANGE {
	public static void main (String[]args){
	     int n,m;
	     Scanner sc=new Scanner(System.in);
	     System.out.println("enter two number to print prime numbers btw them also enter smaller number first");
	     n=sc.nextInt();
	     m=sc.nextInt();
	     for (int i =n;i<=m;i++){
	       if (isPrime (i))
	    	   System.out.print(i+" , ");
	     }
	}
	   static boolean isPrime (int n)
	   { 
	     // 0, 1 negative numbers are not prime
	     if (n < 2)
	       return false;
	     // checking the number of divisors b/w 1 and the number n-1
	     for (int i = 2; i < n; i++)
	       {
	     if (n % i == 0)
	        return false;
	       }
	     // if reached here then must be true
	     return true;
	   }
	 }
