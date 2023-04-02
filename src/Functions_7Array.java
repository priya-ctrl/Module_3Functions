import java.util.Scanner;
public class Functions_7Array {
    public static void main(String [] args){
       int num;
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number of elements of the array");
       num =scan.nextInt();
       int array[] =new int [num];
       System.out.println("Enter the elements of the array");
       for (int index =0; index<num; index++)
       {
           array[index]=scan.nextInt();
       }
       System.out.println("Max. element of the array is " +max(array));
    }

    public static int max(int array[])
    {
        int max = array[0];
        for (int index =0; index <array.length; index++)
        {
            if (max <array[index])
            {
                max = array [index];
            }
        }
        return max;
    }
}
