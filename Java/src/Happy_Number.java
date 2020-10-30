/**
 * Happy Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-021
 */
import java.util.*;
public class Happy_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Happy Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int d,s=0,m=n;
        while(m>0)
        {
            d=m%10;
            s=s+(int)(Math.pow(d,2));
            m=m/10;
            if(m==0 && s>9)
            {
                m=s;
                s=0;
            }
        }
        if(s==1)
            System.out.print(n+" is a Happy number.");
        else
            System.out.print(n+" is not a Happy number.");        
    }
}