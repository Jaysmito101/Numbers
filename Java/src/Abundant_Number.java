/**
 * Abundant Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-010
 */
import java.util.*;
public class Abundant_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Abundant Number Checker\n~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
                s=s+i;
        if(s>n)
            System.out.print(n+" is an Abundant number.");
        else
            System.out.print(n+" is not an Abundant number.");        
    }
}
