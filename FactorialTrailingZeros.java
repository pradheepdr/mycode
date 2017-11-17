import java.util.*;
import java.lang.*;
public class FactorialTrailingZeros {
 
    public static void main(String[] args) {
        //Your Code Here
    Scanner s = new Scanner(System.in);
    int n=s.nextInt();
    int[] a=new int[50];
    int i=1;
    int d=2;
    int k=n/5;
    while(i>0)
    {
        i=(int)n/(int)Math.pow(5,d);
        if(i>0)
        k=k+i;
        d=d+1;
    }
    System.out.println(k);
    }
}



