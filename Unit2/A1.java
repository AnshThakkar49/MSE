import java.util.*;
public class A1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a;
        String b;
        System.out.println("Enter Integer: ");
        a=sc.nextInt();
        if(a<0)
        {
            System.out.println("Number is Negative");
        }
        else
        {
            System.out.println("Number is Positive");
        }   
        b=(a<0) ? "Negative" : "Positive";
        System.out.println(b);
        System.out.println();
    }
    
}
