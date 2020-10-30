/**
 * Disarium Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-029
 */
import java.util.*;
public class Disarium_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Disarium Number Checker\n~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0,d,m=n,i=0;
        while(m>0)
        {
            i++;
            m=m/10;
        }
        m=n;
        while(m>0)
        {
            d=m%10;
            s=s+(int)Math.pow(d,i);
            m=m/10;
            i--;
        }
        if(s==n)
            System.out.print(n+" is a Disarium number.");
        else
            System.out.print(n+" is not a Disarium number.");        
    }
}
