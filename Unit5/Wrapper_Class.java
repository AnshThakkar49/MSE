public class Wrapper_Class 
{
    public static void main(String[] args)
    {
        int a = 20;
        Integer I = Integer.valueOf(a); //Explicit Call
        Integer J = I; //AutoBoxing
        System.out.println(I);
        System.out.println(J);
        //AutoUnboxing
        //Integer j = new Integer(20); //Deprecated i.e. not allowed in higher versions
        //int b = j.intValue();
        //System.out.println(j);
        //System.out.println(b);  
        //For Double
    }
}