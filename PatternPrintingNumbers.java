import java.util.*;
import java.util.Scanner;
public class PatternPrintingNumbers {
 
    public static void main(String[] args) {
        int i,j,rows,num=1,k=1;
        Scanner sc=new Scanner(System.in);
        rows=sc.nextInt();
        for(i=rows;i>=1;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(num+" ");
                num=num+(rows+1)-j;
            }
            k++;
            num=k;
            System.out.println();
        }
 
    }
}