/**
 * SumProduct Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-007
 */
import java.util.*;
public class SumProduct_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("SumProduct Number Checker\n~~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0,p=1,d,m=n;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            p=p*d;
            m=m/10;
        }
        if(p==s)
            System.out.print(n+" is a SumProduct number.");
        else
            System.out.print(n+" is not a SumProduct number.");        
    }
}
