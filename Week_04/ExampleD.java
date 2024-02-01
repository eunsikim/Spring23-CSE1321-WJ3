import java.util.Scanner;

public class ExampleD {
    public static void main(String[] args) {
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Option 1");
        System.out.println("2. Option 2");
        System.out.println("3. Option 3");
        
        System.out.print("Enter an option: ");

        option = sc.nextInt();

        switch(option){
            case 1:
                System.out.println("You chose Option 1");
                break;
            case 2:
                System.out.println("You chose Option 2");
                break;
            case 3:
                System.out.println("You chose Option 3");
                break;
            default:
                System.out.println("You've entered a wrong option");
        }
    }
}
