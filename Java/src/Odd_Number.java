/**
 * Odd Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-002
 */
import java.util.*;
public class Odd_Number
{
    public static void main(String args[])
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Odd Number Checker\n~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        if(n%2!=0)
            System.out.print(n+" is an Odd number.");
        else
            System.out.print(n+" is not an Odd number.");        
    }
}
