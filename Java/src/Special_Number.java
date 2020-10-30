/**
 * Special Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-017
 */
import java.util.*;
public class Special_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Special Number Checker\n~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int m=n,d,s=0;
        Special_Number ob=new Special_Number();
        while(m>0)
        {
            d=m%10;
            s=s+ob.fac(d);
            m=m/10;
        }
        if(s==n)
            System.out.print(n+" is a Special number.");
        else
            System.out.print(n+" is not a Special number.");        
    }
    
    public int fac(int n)
    {
        int f=1;
        while(n>0)
        {
            f=f*n;
            n--;
        }
        return f;
    }
}
