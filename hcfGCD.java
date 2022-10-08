package Ggettingstartedpnsta;

public class hcfGCD {
public static void main(String[]args) {
	int n=27;
	int m=45;
	System.out.println("hcf or gcd");
	for(int i=1;i<=n||i<=m;i++) {
		if(n%i==0&&m%i==0) {
			System.out.println(i);
		}
	}
}
}
