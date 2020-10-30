/**
 * Automorphic Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-019
 */
import java.util.*;
public class Automorphic_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Automorphic Number Checker\n~~~~~~~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        Automorphic_Number ob=new Automorphic_Number();
        if(n==(n*n)%(int)(Math.pow(10,ob.numberOfDigits(n))))
            System.out.print(n+" is an Automorphic number.");
        else
            System.out.print(n+" is not an Automorphic number.");        
    }
    
    public int numberOfDigits(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n=n/10;
        }
        return c;
    }
}
