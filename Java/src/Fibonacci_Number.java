/**
 * Fibonacci Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-012
 */
import java.util.*;
public class Fibonacci_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Fibonacci Number Checker\n~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int a=-1,b=1,c=0;
        boolean flag=false;
        while(c<=n)
        {
            c=a+b;
            if(c==n)
            {
                flag=true;
                break;
            }
            a=b;
            b=c;
        }
        if(flag)
            System.out.print(n+" is a Fibonacci number.");
        else
            System.out.print(n+" is not a Fibonacci number.");        
    }
}

