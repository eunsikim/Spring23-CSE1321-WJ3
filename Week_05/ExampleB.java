import java.util.Scanner;

public class ExampleB {
    public static void main(String[] args) {
        char res1;

        char res2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Has feathers? (Y/N): ");
        res1 = sc.nextLine().charAt(0);

        switch (res1) {
            case 'Y':
                System.out.print("Can fly? (Y/N): ");
                res2 = sc.nextLine().charAt(0);

                switch (res2) {
                    case 'Y':
                        System.out.println("Hawk");
                        break;
                
                    case 'N':
                        System.out.println("Penguin");
                        break;
                }
                break;
        
            case 'N':
                System.out.print("Has fins? (Y/N): ");
                res2 = sc.nextLine().charAt(0);

                switch (res2) {
                    case 'Y':
                        System.out.println("Dolphin");
                        break;
                
                    case 'N':
                        System.out.println("Bear");
                        break;
                }
                break;
        }

    }
}