/**
 * PalPrime Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-027
 */
import java.util.*;
public class PalPrime_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("PalPrime Number Checker\n~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();        
        PalPrime_Number ob=new PalPrime_Number();
        if(ob.isPrime(n) && ob.isPal(n))
            System.out.print(n+" is a PalPrime number.");
        else
            System.out.print(n+" is not a PalPrime number.");        
    }

    public boolean isPrime(int n)
    {
        for(int i=2;i<(n/2);i++)
            if(n%i==0)
                return false;
        return true;
    }

    public boolean isPal(int n)
    {
        int d,r=0,m=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        if(r==m)
            return true;
        else
            return false;
    }
}
