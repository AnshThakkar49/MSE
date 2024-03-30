public class A4 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5};
        int min = arr[0];
        int f = 0;
        for (int i = 1; i < arr.length; i++) 
        {
            if (arr[i]<min) 
            {
                f=1;    
                break;
            }
            else
            {
                min = arr[i];
            }
        }
        if (f==0) 
        {
            System.out.println("Sorted");            
        }        
        else
        {
            System.out.println("Not Sorted");
        }
    }    
}