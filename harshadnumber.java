package Ggettingstartedpnsta;

import java.util.Scanner;

/*
 * 
Harshad number or not using Java : 
Harshad number is a number or an integer in base 10 which is completely divisible by sum of  its digits.

For better understanding let us consider an example.

Example :

Suppose a number 24 .
Calculate the sum of digits of the number (2 + 4) = 6 .
Check whether the number entered by user is completely divisible by sum of its digits or not.
Below are first few Harshad Numbers represented in base 10 :

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………

In this article, we will create a java program to check whether the number entered by the user is Harshad number or not.

harshed or not in java
. 
 */
public class harshadnumber {// 153 4991 21
	public static void main(String[]args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		n= sc.nextInt();
		int m,sum=0;
		m=n;
		 while(m!=0){
	         sum += m % 10; //its will return last digit
	         m = m / 10; 
	     }
	     if(n%sum==0) {
	    		System.out.println("Harshad number");
	     }else
	    		System.out.println("not a harsad number");
		
	}

}
