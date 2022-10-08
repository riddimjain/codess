package Ggettingstartedpnsta;

import java.util.Scanner;

public class greatresamongstthree {
public static void main(String[]args) {
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter three numbers");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	if(a<b&&c<b) {
		System.out.println("bis grester");
	}else if(b<a&&c<a) {
		System.out.println("a is gretsert ");
	}else
		System.out.println("c is greater");
}
}
