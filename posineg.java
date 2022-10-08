package Ggettingstartedpnsta;

import java.util.Scanner;

public class posineg {
public static void main(String[]args) {
	int n;
	Scanner kb= new Scanner(System.in);
	
	System.out.println("enter a number");
	n=kb.nextInt();
	if(n<0)
	{
		System.out.println("negative");
	}else if(n>0) {
		System.out.println("positive");
	}else {
		System.out.println("zeerio");
	}
}
}

