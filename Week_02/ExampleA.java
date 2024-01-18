import java.util.Scanner;
    
public class ExampleA{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int age;

        System.out.print("How old are you?: ");
        age = sc.nextInt();

        System.out.println("Your are " + age + " years old.");
    }
}