class Parent
{
    public void display()
    {
        System.out.println("Method Overriden");
    }
}
class Child extends Parent
{
    public void display()
    {
        System.out.println("Ovveriding Method");
    }
}
public class DMD 
{
    public static void main(String[] args)
    {
        Parent p =new Child();
        p.display();
    }
    
}
