/**
 * Sunny Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-025
 */
import java.util.*;
public class Sunny_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Sunny Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        if((int)Math.sqrt(n+1)==(int)Math.ceil(Math.sqrt(n)))
            System.out.print(n+" is a Sunny number.");
        else
            System.out.print(n+" is not a Sunny number.");        
    }
}
