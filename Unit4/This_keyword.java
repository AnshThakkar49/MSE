class student
{
    String name;
    int id;
    int age;
    student()
    {
        id = 123;
        name = "Abc";
    }
    student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
    student(int id, String name, int age)
    {
        this(id,name);
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name: "+name);
        System.out.println("id: "+id);
        System.out.println("age: "+age);
    }
}
public class This_keyword 
{
    public static void main(String[] args) 
    {
        student s1 = new student(93,"Ansh");
        student s2 = new student(97,"Meet",19);
        s1.display();
        s2.display();
    }    
}