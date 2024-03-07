import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        int[][] twoDInts = new int[2][3];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < twoDInts.length; i++) {
            for (int j = 0; j < twoDInts[0].length; j++) {
                System.out.print("Enter an integer: ");
                twoDInts[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < twoDInts.length; i++) {
            for (int j = 0; j < twoDInts[0].length; j++) {
                System.out.print(twoDInts[i][j] + " ");
            }
            System.out.println();
        }
    }
}
