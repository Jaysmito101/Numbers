/**
 * Pronic Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-028
 */
import java.util.*;
public class Pronic_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Pronic Number Checker\n~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++)
            if(n==i*(i+1))
                flag=true;
        if(flag)
            System.out.print(n+" is a Pronic number.");
        else
            System.out.print(n+" is not a Pronic number.");        
    }
}
