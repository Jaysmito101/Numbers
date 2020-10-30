/**
 * Even Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-001
 */
import java.util.*;
public class Even_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Even Number Checker\n~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.print(n+" is an Even number.");
        else
            System.out.print(n+" is not an Even number.");        
    }
}
