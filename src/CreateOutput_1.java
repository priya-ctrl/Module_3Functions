import java.util.Scanner;
import java.io.FileWriter;

public class CreateOutput_1 {
    public static void main(String[] args){
        Scanner scan =new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter("/Users/PriyadarsiniNair/Desktop/Output.txt");
            Boolean write = true;

            System.out.println("Enter what you wish to write");
            String line = scan.nextLine();
            writer.write(line);

            writer.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Correct");
        }


    }

}
