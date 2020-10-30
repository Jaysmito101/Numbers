/**
 * Buzz Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-018
 */
import java.util.*;
public class Buzz_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Buzz Number Checker\n~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        if(n%7==0 || n%10==7)
            System.out.print(n+" is a Buzz number.");
        else
            System.out.print(n+" is not a Buzz number.");        
    }
}
