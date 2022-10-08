package Ggettingstartedpnsta;

public class armsstrong {
	public static void main(String[]args) {
	int num = 407;
			int len;
	  len = Numlength (num);
    if (armstrong (num, len))
        System.out.println(num + " is armstrong");
    else
        System.out.println(num + " is armstrong");
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
      };
      // 405 4 sqaure+ 0  sqaure+ 5 square 

    return num == sum;
  }
}

