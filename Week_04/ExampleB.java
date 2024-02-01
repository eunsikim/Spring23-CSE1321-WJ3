import java.util.Scanner;

public class ExampleB {
    public static void main(String[] args) {
        String name;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter your name: ");

        name = sc.nextLine();

        // Valid names: Eun Sik, John
        //name.equalsIgnoreCase("Eun Sik")
        if(name.equalsIgnoreCase("Eun Sik") || name.equalsIgnoreCase("John")){
            System.out.println("You have access");
        }
        else{
            System.out.println("You do not have access");
        }
    }
}
