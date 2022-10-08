package Ggettingstartedpnsta;

import java.util.Scanner;

public class Evenodd2 {
	public static void main(String[]args) {
	int n;
	Scanner kb= new Scanner(System.in);
	System.out.println("enter a number");
	n=kb.nextInt();
	if(n%2==0) {
		System.out.println("even");
	}else
		System.out.println("oddd");
}
}