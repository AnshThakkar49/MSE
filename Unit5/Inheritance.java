class base
{
    int base_value = 10;
    public void display()
    {
        System.out.println("Method from base");
    }
}
class Derived extends base
{
    public void derived()
    {
        System.out.println("Method from Derived");
    }
}
public class Inheritance 
{
    public static void main(String[] args)
    {
        Derived d1 = new Derived();
        d1.display();
        d1.derived();
        d1.base_value = 20;
        System.out.println(d1.base_value);
    }    
}