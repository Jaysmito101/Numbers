/**
 * Deficient Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-011
 */
import java.util.*;
public class Deficient_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Deficient Number Checker\n~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
            s=s+i;
        if(s<n)
            System.out.print(n+" is a Deficient number.");
        else
            System.out.print(n+" is not a Deficient number.");        
    }
}
