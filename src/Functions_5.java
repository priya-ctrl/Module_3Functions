public class Functions_5 {
    public static void main(String[] args){
        int num1 = 20;
        int num2 = 27;
        int num3 = 23;
        int num4 = 15;
        String compareresult = compare(num1,num2);
        String compareresult2 = compare (num3,num4);
        System.out.println(compareresult);
        System.out.println(compareresult2);
    }

    public static String compare(int var1, int var2){
        String result;
        if (var1>var2)
        {
            result = var1 + "is larger than " +var2;
        }
        else if (var1==var2)
        {
         result = "Both numbers are equal";
        }
        else
        {
            result = var2 + "is larger than "+var1;
        }
        return result;
    }
}
