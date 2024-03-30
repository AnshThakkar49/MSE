public class TestCircle 
{
    public static void main(String[] args) 
    {
        // Create a new SimpleCircle() object that is referred by circle1 reference variable
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("The area of the circle of radius " +
        circle1.radius + " is " + circle1.getArea());
        // Modify circle radius
        circle1.radius = 100;
        System.out.println("The area of the circle of radius " +
        circle1.radius + " is " + circle1.getArea());
    }
}
class SimpleCircle 
{
    double radius=1; // Data Field (Instance Variable)
    /** instance method that Returns the area of this circle */
    double getArea() 
    {
        return radius * radius * Math.PI;
    }
}