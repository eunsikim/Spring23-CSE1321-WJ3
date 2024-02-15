import java.util.Random;

public class rng {
    public static void main(String[] args) {
        Random rand = new Random();

        
        for(int i = 0; i < 10; i++){
            // Generate a number [0, 9] or [0, 10)
            int randomNumber1 = rand.nextInt(10); 
            // Generate a number from [0, 5], then shift the values by +5 so: [5, 10]
            int randomNumber2 = rand.nextInt(6) + 5; 
            System.out.println("[0, 9]: " + randomNumber1);
            System.out.println("[5, 10]: " + randomNumber2);
            System.out.println();
        }
    }
}
