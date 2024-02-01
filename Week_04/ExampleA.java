public class ExampleA {
    public static void main(String[] args) {
        // number must be greater than or equal to 5 and lesser than 10
        int number = 5;

        if(number >= 5 && number < 10){
            System.out.println("The number is valid");
        }
        else{
            System.out.println("The number is invalid");
        }

        // if(number < 5){
        //     System.out.println("The number is invalid");
        // }
        // else if(number >= 10){
        //     System.out.println("The number is invalid");
        // }
        // else{
        //     System.out.println("The number is valid");
        // }
    }
}
