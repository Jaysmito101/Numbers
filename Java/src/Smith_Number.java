/**
 * Smith Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-031
 */
import java.util.*;
public class Smith_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Smith Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int m=n,s=0,d,t=2,p=0;
        while(m>1)
        {
            if(m%t==0)
            {
                p=p+t;
                System.out.println(t);
                m=m/t;
            }
            else
                t++;
        }
        m=n;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            m=m/10;
        }
        if(p==s)
            System.out.print(n+" is a Smith number.");
        else
            System.out.print(n+" is not a Smith number.");        
    }
}
