class person
{
    person()
    {
        System.out.println("Person Class");
    }
}
class employee extends person
{
    employee()
    {
        System.out.println("Employee Class");
    }
}
class faculty extends employee
{
    faculty()
    {
        System.out.println("Faculty Class");
    }
}
public class Inheritace_ex 
{
    public static void main(String[] args) 
    {
        faculty f = new faculty();        
    }
}