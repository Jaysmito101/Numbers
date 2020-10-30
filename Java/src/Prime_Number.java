/**
 * Prime Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-003
 */
import java.util.*;
public class Prime_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Prime Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
            System.out.print(n+" is a Prime number.");
        else
            System.out.print(n+" is not a Prime number.");        
    }
}
