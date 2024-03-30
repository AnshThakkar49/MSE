import java.util.*;
class time
{
    int hour,min;
    time(int h,int m)
    {
        hour=h;
        min=m;
    }
    public void add(time t)
    {
        time t3=new time(0,0);
        t3.hour=hour+t.hour;
        t3.min=min+t.min;
        if(t3.min>=60)
        {
            t3.hour=t3.hour+(t3.min/60);
            t3.min=t3.min%60;
        }
        System.out.println("Time :"+t3.hour+"\nMinutes:"+t3.min);
    }
}
public class TestTime 
{
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        time t1 = new time(5,60);
        time t2 = new time(5,30);
        t1.add(t2);
    }
}