/**
 * Magic Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-020
 */
import java.util.*;
public class Magic_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Magic Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int d,s=0,m=n;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            m=m/10;
            if(m==0 && s>9)
            {
                m=s;
                s=0;
            }
        }
        if(s==1)
            System.out.print(n+" is a Magic number.");
        else
            System.out.print(n+" is not a Magic number.");        
    }
}