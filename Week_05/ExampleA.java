import java.util.Scanner;

public class ExampleA {
    public static void main(String[] args) {
        char res1;

        char res2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Has feathers? (Y/N): ");
        res1 = sc.nextLine().charAt(0);

        if(res1 == 'Y'){
            System.out.print("Can fly? (Y/N): ");
            res2 = sc.nextLine().charAt(0);

            if(res2 == 'Y'){
                System.out.println("Hawk");
            }
            else{
                System.out.println("Penguin");
            }
        }
        else{
            System.out.print("Has fins? (Y/N): ");
            res2 = sc.nextLine().charAt(0);
            
            if(res2 == 'Y'){
                System.out.println("Dolphin");
            }
            else{
                System.out.println("Bear");
            }
        }
    }
}