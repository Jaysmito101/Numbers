/**
 * Neon Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-024
 */
import java.util.*;
public class Neon_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Neon Number Checker\n~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0,d,m=n*n;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            m=m/10;
        }
        if(s==n)
            System.out.print(n+" is a Neon number.");
        else
            System.out.print(n+" is not a Neon number.");        
    }
}
