import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadInput_2 {
    public static void main (String[] args) throws FileNotFoundException{

        File InputFile = new File("/Users/PriyadarsiniNair/Desktop/quiz_numbers.txt");
        Scanner scan = new Scanner(InputFile);

        int sum = 0; // to initiate addition
        int avg = 1;

           while (scan.hasNext()==true){
               String Line = scan.nextLine();
               avg++;
            int number = scan.nextInt();
            sum = sum+ number;

        }
        System.out.println("Sum of numbers in text file is : "+ sum);
        System.out.println("Sum of numbers in text file is : "+ avg);
        }
    }

