/**
 * Harshad Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-015
 */
import java.util.*;
public class Harshad_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Harshad Number Checker\n~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();        
        int m=n,d,s=0;
        while(m>0)
        {
            d=m%10;
            s=s+d;
            m=m/10;
        }
        if(n%s==0)
            System.out.print(n+" is a Harshad number.");
        else
            System.out.print(n+" is not a Harshad number.");        
    }
}
