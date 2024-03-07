import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        String[] studentNames = new String[2];

        Scanner sc = new Scanner(System.in);

        // CREATE
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter name: ");
            studentNames[i] = sc.nextLine();
        }

        System.out.println("OUTPUT: ");
        // READ
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }

        studentNames[0] = "John";

        System.out.println("OUTPUT: ");
        // READ
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i]);
        }

    }
}
