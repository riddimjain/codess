package Ggettingstartedpnsta;
import java.util.Scanner;
public class prime {
		public static void main (String[]args){
			
			       //taking value from user and sending to method isPrime
			        Scanner sc=new Scanner(System.in);
					int  n ;
					System.out.println("enter a number");
					n=sc.nextInt();
					// m=sc.nextInt();
				    // for (int i =n;i<=m;i++){  for printing prime nubers btw range n to m
					if(isPrime(n))
						System.out.print("prime");
					else
					   System.out.println("not prime");
					
				}
		//method to check number is prime or not 
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

