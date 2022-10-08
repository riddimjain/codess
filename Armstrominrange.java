package Ggettingstartedpnsta;
public class Armstrominrange {
	public static void main(String[]args) {
	int num1=1,num2=1000,num,len;
	for (int i=num1;i<=num2;i++) { 
	len = Numlength (i);
    if(armstrong(i,len)){
    	System.out.print(i+" ");
    }
  }
}
	
	static int Numlength (int x)
	{
	  int len = 0;
	  while (x != 0 )
	    {
		len++;
		x = x / 10;
	    }
	  return len;
	}
	 
	static boolean armstrong (int num, int len) { 
	     int sum = 0, temp, digit;
	    temp = num;
	    while (temp != 0) {
		digit = temp % 10;
		sum = sum + (int)Math.pow(digit,len);  	
		temp /= 10;
	      }
            return num == sum;
	  }
	
}



