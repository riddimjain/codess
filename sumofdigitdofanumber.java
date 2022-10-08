package Ggettingstartedpnsta;

import java.util.Scanner;

public class sumofdigitdofanumber {
	public static void main(String[] args) {
		 int sum=0;
		 int num;
		 System.out.println("enter a digitd to find its sum of digits");
		 Scanner sc= new Scanner(System.in);
		 num=sc.nextInt();
			     //loop to find sum of digits
			     while(num!=0){
			         sum += num % 10; //its will return last digit
			         num = num / 10; 
			     }
			     //output
			       System.out.println ("Sum of digits : " + sum);
			   }

}