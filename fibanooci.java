package Ggettingstartedpnsta;

public class fibanooci {//A series of numbers in which each number is the sum of
	                    //the two preceding numbers is known as a Fibonacci Series.

	public static void main(String[]args) {
     int num = 15;
     int a = 0,b = 1;

     // Here we are printing 0th and 1st terms
       System.out.print (a + " , " + b );
       int nextTerm;

     // printing the rest of the terms here
     for (int i = 2; i < num; i++)
       {
      nextTerm = a + b;
      a = b;
          b = nextTerm;
          System.out.print(" , "+nextTerm );
       }


   }
 }
