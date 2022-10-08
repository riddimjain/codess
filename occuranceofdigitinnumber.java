package Ggettingstartedpnsta;

public class occuranceofdigitinnumber {
    public static void main (String[] args) {
    	int n = 898989;
    		count(n,8);
    
}

    
   static void count(int n,int d) 
    {
    	int count = 0;


        while(n>0){
            int rem = n%10;
            if(rem == d)
                count++;
            n /= 10;
        }
        System.out.println(count);

    }

}

