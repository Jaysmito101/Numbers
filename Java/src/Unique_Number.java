/**
 * Unique Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-013
 */
import java.util.*;
public class Unique_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Unique Number Checker\n~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int m=n,d,c=0;
        boolean flag=false;
        for(int i=0;i<10;i++)
        {
            while(m>0)
            {
                d=m%10;
                if(d==i)
                    c++;
                m=m/10;
            }
            if(c>1)
            {
                flag=true;
                break;
            }
            m=n;
            c=0;
        }
        if(!flag)
            System.out.print(n+" is an Unique number.");
        else
            System.out.print(n+" is not an Unique number.");        
    }
}
