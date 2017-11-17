import java.util.*;
public class ProductOfThreeConsecutivePrimes {

    public static void main(String[] args) {
		//Your Code Here
Scanner s=new Scanner(System.in);
long n=s.nextLong();
int c=0;
for(int i=2;i<n;i++)
{
if(n%i==0 && c<3)
{
  c++;
  System.out.println(i+" ");
}
	}
    }
}