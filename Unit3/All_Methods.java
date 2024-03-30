import java.util.*;
public class All_Methods
{
    public static void sub()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A & B respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Subtraction is: "+(a-b));
    }
    public static int mul()
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A & B Respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        return(a*b);
    }
    public static void add(int a, int b)
    {
        System.out.println("Addition is: "+(a+b));
    }
    public static int div(int a, int b)
    {
        double d;
        d=a/b;
        return(a/b);
    }
    public static void main(String[] args)
    {
        int a,b;
        Scanner sc = new Scanner(System.in);
        sub();
        System.out.println("Multiplication is: "+mul());
        System.out.println("Enter A & B respectively: ");
        a=sc.nextInt();
        b=sc.nextInt();
        add(a,b);
        System.out.println("Division is: "+div(a,b)); 
    }
}