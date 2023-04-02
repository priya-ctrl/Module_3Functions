public class Exceptions_1 {
    public static void main (String [] args){

        try {
            int data =67/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
