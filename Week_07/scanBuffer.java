import java.util.Scanner;

public class scanBuffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        System.out.println(number);
        System.out.println(word);
        System.out.println("End of program");
    }
}
