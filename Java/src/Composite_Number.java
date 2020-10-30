/**
 * Composite Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-004
 */
import java.util.*;
public class Composite_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Composite Number Checker\n~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
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
        if(flag)
            System.out.print(n+" is a Composite number.");
        else
            System.out.print(n+" is not a Composite number.");        
    }
}
