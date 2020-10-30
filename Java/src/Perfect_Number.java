/**
 * Perfect Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-009
 */
import java.util.*;
public class Perfect_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Perfect Number Checker\n~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n/2;i++)
            if(n%i==0)
            s=s+i;
        if(s==n)
            System.out.print(n+" is a Perfect number.");
        else
            System.out.print(n+" is not a Perfect number.");        
    }
}
