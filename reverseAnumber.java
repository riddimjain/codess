package Ggettingstartedpnsta;
import java.util.Scanner;// importing scanner
public class reverseAnumber {
	public static void main(String[] args) {//main method
		 int reverse=0;
		 int num,rem;
		 System.out.println("enter a digit to reverse it");
		 Scanner sc= new Scanner(System.in);
		 num=sc.nextInt();
	  //loop to find sum of digits
		 while (num != 0)
	        {
	            rem = num % 10;
	            /*//here in 1st iteration nuber is 6485 and will retuen 5
	             * then 648 will give 8
	             * then 64 will givw 4
	             * thwn 6 will give 6
	             */
	                           
	            reverse = reverse * 10 + rem;
	            /*// if number is 6485
	             * reverse=0--
	             0  * 10+5[value from rem]        (5)
	             5  * 10+8                       (58)
	             58 * 10+4                       (584)
	             584* 10+6                       (5486)
	             number reverserd
	             */
	            num /= 10;
	            /*
	             * when number is not divided 6458
	             * after interation
	             * 1   645
	             * 2   64 
	             * 3   6
	             * 4   0   "loop terminated"
	             */
	        }

			       System.out.println ("reverse of digits : "+ reverse);
			   }
}


