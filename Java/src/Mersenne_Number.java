/**
 * Mersenne Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-000
 */
import java.util.*;
public class Mersenne_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Mersenne Number Checker\n~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=1;i<=n;i++)
        {
            if(n==(int)(Math.pow(2,i))-1)
            flag=true;
        }
        if(flag)
            System.out.print(n+" is a Mersenne number.");
        else
            System.out.print(n+" is not a Mersenne number.");        
    }
}
