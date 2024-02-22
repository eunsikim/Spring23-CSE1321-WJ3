public class ForLoop {
    public static void main(String[] args) {
        System.out.println("Initializing for loop:\n");

        for(int i = 0; i < 3; i++){
            System.out.println("\tIteration #" + (i + 1) +" operation 1");
            System.out.println("\tIteration #" + (i + 1) +" operation 2");
            System.out.println("\tIteration #" + (i + 1) +" operation 3\n");
        }
        
        System.out.println("For loop terminated");
    }
}
