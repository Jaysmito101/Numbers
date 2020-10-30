/**
 * Palindrome Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-006
 */
import java.util.*;
public class Palindrome_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Palindrome Number Checker\n~~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int m=n,r=0,d;
        while(m>0)
        {
            d=m%10;
            r=r*10+d;
            m=m/10;
        }
        if(r==n)
            System.out.print(n+" is a Palindrome number.");
        else
            System.out.print(n+" is not a Palindrome number.");        
    }
}