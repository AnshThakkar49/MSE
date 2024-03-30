class GrandParent
{
    public void display()
    {
        System.out.println("Method from GrandParent");
    }
}
class Parent extends GrandParent
{
    public void p()
    {
        System.out.println("Method From Parent");
    }
}
class child extends GrandParent
{
    public void ch()
    {
        System.out.println("Method from child");
    }
}
public class Multi_inheritance 
{
    public static void main(String[] args)
    {
        child c1 = new child();
        Parent p1 = new Parent();
        c1.ch();
        c1.display();
        p1.p();
        p1.display();    
    }
}
