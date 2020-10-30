/**
 * Multiple Harshad Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-016
 */
import java.util.*;
public class MultipleHarshad_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("MultipleHarshad Number Checker\n~~~~~~~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();        
        MultipleHarshad_Number ob=new MultipleHarshad_Number();
        int m=n;
        boolean flag=false;
        while(m>9)
        {
            flag=false;
            if(m%ob.sumOfDigits(m)==0)
                flag=true;
            m=m/ob.sumOfDigits(m);
        }
        if(flag)
            System.out.print(n+" is a MultipleHarshad number.");
        else
            System.out.print(n+" is not a MultipleHarshad number.");        
    }

    public int sumOfDigits(int n)
    {
        int s=0,d;
        while(n>0)
        {
            d=n%10;
            s=s+d;
            n=n/10;
        }
        return s;
    }
}