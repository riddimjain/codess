package Ggettingstartedpnsta;

public class demo {
	public static void main(String[]args) {
		int[]orderID= {45,545,555,545};
		int n,sum;
for(int i=0;i<orderID.length;i++) {
	n=orderID[i]; 
	sum=0;
	  //loop to find sum of digits
     while(n!=0){
         sum += n % 10; //its will return last digit
         n = n / 10; 
     }
     System.out.println(sum);
     }

}
}