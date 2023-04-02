import java.util.Scanner;
public class Functions_6 {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number");
        System.out.println();
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        String primeNumber = prime(num);
        System.out.println(primeNumber);
    }

     public static String prime(int num){
     boolean primecheck = true;
     String result;
     for (int i =2; i<=Math.sqrt(num); i++){
         if (num % i==0){
             primecheck =false;
             break;
         }
     }
     if (primecheck == true) {
         result = num + " is a Prime Number";
     }
     else {
         result = num + " is not a Prime Number";
     }
         return result;
     }
}
