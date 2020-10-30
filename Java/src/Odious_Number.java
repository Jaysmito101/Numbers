/**
 * Odious Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-022
 */
import java.util.*;
public class Odious_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Odious Number Checker\n~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int m=n,c=0,t;
        while(m>0)
        {
            t=m%2;
            m=m/2;
            if(t==1)
                c++;
        }
        if(c%2!=0)
            System.out.print(n+" is an Odious number.");
        else
            System.out.print(n+" is not an Odious number.");        
    }
}