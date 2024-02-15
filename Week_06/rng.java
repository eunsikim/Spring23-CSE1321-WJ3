import java.util.Random;

public class rng {
    public static void main(String[] args) {
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            int randomNumber = rand.nextInt(123);
            System.out.println(randomNumber);
        }
    }
}
