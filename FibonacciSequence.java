import java.util.*;
public class FibonacciSequence {

    public static void main(String[] args)
    {
        int n;
        long a=0, b=0, c=1;
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=1; i<=n; i++)
        {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a+" ");
        }
    }
}