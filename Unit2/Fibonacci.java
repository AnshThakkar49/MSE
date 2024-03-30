import java.util.*;
public class Fibonacci 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        b = 0;
        c = 1;
        System.out.println("Enter A: ");
        a = sc.nextInt();
        System.out.print("Fibonacci Series is: ");
        System.out.print(b+"\t");
        System.out.print(c+"\t");
        for (int i = 2; i < a; i++) 
        {
            d=b+c;
            System.out.print(d+"\t");
            b=c;
            c=d;            
        }
    }    
}