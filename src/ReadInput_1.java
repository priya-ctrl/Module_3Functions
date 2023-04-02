import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadInput_1 {

    public static void main(String[] args) throws FileNotFoundException {
        File inputfile = new File("/Users/PriyadarsiniNair/Desktop/Alice.txt");

        Scanner scan = new Scanner(inputfile);
        //Reading each line of the file
        int LineNumber = 1; // Tracking Line Number
        while (scan.hasNextLine() == true) {

            String Line = scan.nextLine();
            System.out.println("Line " + LineNumber + " :" + Line);
            LineNumber++;
        }
    }
}
