class Parent
{
    public final void disp()
    {
        System.out.println("Parent");
    }
}
class Child extends Parent
{
    public void disp()
    {
        System.out.println("Child");
    }
}
public class Final1 
{
    public static void main(String[] args) {
        Child c = new Child();
        c.disp();
        Parent p = new Parent();
        p.disp();

    }
    
}
