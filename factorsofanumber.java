package Ggettingstartedpnsta;

public class factorsofanumber {

    public static void main(String[] args) {

    int num = 10;

   System.out.println( "Factors of " + num + " are " );

   // finding and printing factors b/w 1 to num
   for(int i = 1; i <= num; i++)
   {
       if(num % i == 0)// % gives remainder
           System.out.println(i + " "); 
   }

    }
}

/* num 10
 *                2 10----renm=0
 *                3 10  rem---1
 *                4 10 rem-----2
 *                5  5----rem-=0
 *                1  1---- rem=0
 *                   * 
 */
