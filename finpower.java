package Ggettingstartedpnsta;
import java.util.Scanner;

public class finpower {
	public static void main(String[]args) {
		double number, power;
		Scanner sc = new Scanner(System.in);
		number=sc.nextDouble();
		power=sc.nextDouble();
		System.out.println(Math.pow(power, number));// take arguments in double
	}

}
