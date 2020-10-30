/**
 * Twisted Prime Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-005
 */
import java.util.*;
public class TwistedPrime_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("TwistedPrime Number Checker\n~~~~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();        
        TwistedPrime_Number ob=new TwistedPrime_Number();
        if(ob.isPrime(n) && ob.isPrime(ob.rev(n)))
            System.out.print(n+" is a TwistedPrime number.");
        else
            System.out.print(n+" is not a TwistedPrime number.");        
    }

    public boolean isPrime(int n)
    {
        for(int i=2;i<(n/2);i++)
            if(n%i==0)
                return false;
        return true;
    }
    
    public int rev(int n)
    {
        int r=0,d;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }
}
