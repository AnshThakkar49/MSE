import java.util.*;
public class Prime 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a,f;
        System.out.println("Enter Number: ");
        a=sc.nextInt();
        f=0;
        if(a!=1)
        {
            for(int i=2; i<a ; i++)
            {
                if(a%i==0)
                {
                    f=1;
                    break;
                }
                else
                {
                    f=0;
                }
            }
            if (f==0) 
            {
                System.out.println("Prime");                
            }
            else
            {
                System.out.println("Non Prime");
            }
        }
        else
        {
            System.out.println("Non Prime");
        }
    }    
}