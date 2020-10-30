/**
 * Adams Number Checker
 * 
 * @author Jaysmito Mukherjee 
 * @version 2019-A-030
 */
import java.util.*;
public class Adams_Number
{
    public static void main()
    {
        System.out.print("\f");
        Scanner sc=new Scanner(System.in);
        System.out.print("Adams Number Checker\n~~~~~ ~~~~~~ ~~~~~~~\nEnter the number: ");
        int n=sc.nextInt();
        Adams_Number ob=new Adams_Number();
        int a;
        a=(int)Math.pow(n,2);
        a=ob.rev(a);
        a=(int)Math.sqrt(a);
        a=ob.rev(a);
        if(a==n)
            System.out.print(n+" is an Adams number.");
        else
            System.out.print(n+" is not an Adams number.");        
    }
    
    public int rev(int n)
    {
        int r=0,d;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }
}
