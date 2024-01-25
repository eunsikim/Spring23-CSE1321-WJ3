public class ExampleA {
    public static void main(String[] args) {
        //  Constant Variables
        final float PI = 3.14f;
    
        //  Modulus
        int mod = 16 % 9;

        System.out.println(mod);
    
        //  Truncation + Casting
        System.out.println(4 + 2.2);

        int number1 = 4;
        float number2 = 2.2f;

        /*  Before the program assigns a value to res1, it will 
            cast number2 into an integer which will truncate its value
            from 2.2 to just 2. After the casting, the program will
            perform the addition and finally assign the value 6
            to res1 
        */ 
        int res1 = number1 + (int)number2;

        System.out.println(res1);

    }
}
