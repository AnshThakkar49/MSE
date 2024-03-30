class rectangle
{
    int length,width;
    rectangle()
    {
        length = 1;
        width = 1;
    }
    rectangle(int l, int w)
    {
        length = l;
        width = w;
    }
    public int getArea()
    {
        int area = length*width;
        return area;
    }
}
public class Rect 
{
    public static void main(String[] args)
    {
        int len = 3;
        int wid = 4;
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.length = len;
        r1.width = wid;
        System.out.println(r1.getArea());
        System.out.println(r2.getArea());
    }    
}