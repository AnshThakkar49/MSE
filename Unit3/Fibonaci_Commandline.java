public class Fibonaci_Commandline
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int c,n;
        System.out.print(a+"\t");
        System.out.print(b+"\t");
        n=Integer.parseInt(args[0]);
        for(int i = 2; i < n; i++)
        {
            c=a+b;
            System.out.print(c+"\t");
            a=b;
            b=c;
        }
    }
}