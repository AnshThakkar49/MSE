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
public class Method_Overriding 
{
    public static void main(String[] args) 
    {
        Child c = new Child();
        c.display();
        Parent p = new Parent();
        p.display();   
        c.display();     
    }    
}