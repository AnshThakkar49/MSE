import java.util.*;
public class PalindromeString 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a,b;
        b="";
        int length;
        System.out.println("Enter String: ");
        a=sc.next();
        length = a.length();
        for(int i=length-1; i>= 0 ;i--)
        {
            b=b+(a.charAt(i));
        }
        if(a.equals(b))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Non Palindrome");
        }
    }   
}
