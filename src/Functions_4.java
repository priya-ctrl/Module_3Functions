import java.util.Scanner;
public class Functions_4 {
    public static void main (String[] args){
        System.out.println("Whom would you like to welcome?");
        String name;
        Scanner scan = new Scanner(System.in);
        name = scan.next();
        printGreeting(name);
    }

    public static void printGreeting(String name) {
        System.out.println("Hello " + name);
    }
}
