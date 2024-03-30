public class Jagged_Array
{
    public static void main(String[] args)
    {
        int Jagged_array[][]= new int[3][];
        Jagged_array[0]=new int[]{10,20,30};
        Jagged_array[1]=new int[]{40,50};
        Jagged_array[2]=new int[]{60,70,80,90};
        for(int i = 0; i<Jagged_array.length;i++)
        {
            for (int j = 0; j < Jagged_array[i].length; j++) 
            {
                System.out.print(Jagged_array[i][j]+"\t");                
            }
            System.out.println("");
        }
    }
}