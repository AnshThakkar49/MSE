class student
{
    String name;
    int id;
    student()
    {
        name = "ABC";
        id = 123;
    }
    public void display()
    {
        System.out.println("Name is: "+name);
        System.out.println("Id is: "+id);
    }
}
public class Non_parameterized_Constructor 
{
    public static void main(String[] args)
    {
        student s1 = new student();
        student s2 = new student();
        s1.name = "Ansh";
        s1.id = 123;
        s1.display();
        s2.display();
    }
    
}
