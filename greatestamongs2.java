package Ggettingstartedpnsta;

import java.util.Scanner;

public class greatestamongs2 {
	public static void main(String[]args) {
	int a,b;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter two numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a<b) {
		System.out.println(b+"is greateer");
	}else
		System.out.println(a+"is greatet");

}
}
