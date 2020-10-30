/**
 * Armstrong Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-008
 */
import java.util.*;
public class Armstrong_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Armstrong Number Checker\n~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0,d,m=n;
        while(m>0)
        {
            d=m%10;
            s=s+(int)(Math.pow(d,3));
            m=m/10;
        }
        if(s==n)
            System.out.print(n+" is an Armstrong number.");
        else
            System.out.print(n+" is not an Armstrong number.");        
    }
}
