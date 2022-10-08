package Ggettingstartedpnsta;
// find the greatest
// run the loop till n*m
public class LCM {

	public static void main(String[]args) {
		int n=36;
		int m=60;
		int max=(n>m)?n:m;
		//max se chalu krn aloop
		for(int i=max;i<=n*m;i++) {
			if(i%n==0&&i%m==0) {
				System.out.println("lcm  "+i);
				break;
		}
	}
	
	}
}
