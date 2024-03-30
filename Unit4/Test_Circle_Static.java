import java.util.*;
class ar_circle
{
    double radius;
    static int objects = 0;
    public int getobjects()
    {
        return objects;
    }
    ar_circle()
    {
        objects++;
    }
}
public class Test_Circle_Static
{
    public static void main(String[] args)
    {
        double rad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius: ");
        rad = sc.nextDouble();
        ar_circle c1 = new ar_circle();
        System.out.println("Total Objects Created are: "+(ar_circle.objects));             
    }    
}