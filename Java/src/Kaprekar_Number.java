/**
 * Kaprekar Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-026
 */
import java.util.*;
public class Kaprekar_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Kaprekar Number Checker\n~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int c=0,a=0,b=0,m=n*n,o=n;
        while(o>0)
        {
            c++;
            o=o/10;
        }
        a=m%(int)Math.pow(10,c);
        b=m/(int)Math.pow(10,c);
        if(a+b==n)
            System.out.print(n+" is a Kaprekar number.");
        else
            System.out.print(n+" is not a Kaprekar number.");        

    }
}
