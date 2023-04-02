import java.util.Scanner;
public class Functions_8_LCM {
    // To get user input and to call the LCM Function
    public static void main (String[] args){
        int num1, num2;
        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter any two digits");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        System.out.println();

        System.out.println(" LCM of the given numbers is "+ findLCM(num1,num2));

    }

    // Finds the GCD of any two numbers
    public static int findGCD(int x, int y) {
        if (x == 0)
            return y;
        return findGCD(y%x,x); // returns GCD
    }
    static int findLCM (int x, int y) // find LCM
    {
        return (x/findGCD(x,y))*y;
    }
}
