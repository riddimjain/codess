package Ggettingstartedpnsta;
import java.util.Scanner;
public class leapyear {
public static void main(String[]args) {
	int a;
	System.out.println("enter a year");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	if(a%400==0) {
		System.out.println("leap year");
	}else if(a%4==0&&a%100!=0) {
		System.out.println(" leap year");
}else
	System.out.println("not a bleap year");
}
}