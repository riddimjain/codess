package Ggettingstartedpnsta;
import java.util.Scanner;
public class palindrome {
	public static void main(String[]args) {
	int reverse=0;
	 int num,num1,rem;
	 System.out.println("enter a number to check it is palandronme or not");
	 Scanner sc= new Scanner(System.in);
	 num1=sc.nextInt();
	 num=num1;	
 //loop to find sum of digits
	 while (num != 0)
       {
           rem = num % 10;             
           reverse = reverse * 10 + rem;
           num /= 10;
       };
	 if (num1== reverse)
	       System.out.println (num1+ " is Palindrome");
	     else
	       System.out.println (num1 + " is not Palindrome");
	   }
	 }
