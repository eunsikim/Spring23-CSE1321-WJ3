public class NestedForLoop {
    public static void main(String[] args) {
        int outerLoopIterations = 3;

        System.out.println("Starting For loop\n");

        for(int i = 0; i < 3; i++){
            System.out.println("\tIteration #" + (i + 1) +" operation 1");

            System.out.println("\tInitializing inner for loop:");
            for(int j = 0; j < 2; j++){
                System.out.println("\t\tIteration #" + (j + 1) +" operation 1");
                System.out.println("\t\tIteration #" + (j + 1) +" operation 2");
            }
            System.out.println("\tInner For loop terminated");

            System.out.println("\tIteration #" + (i + 1) +" operation 2");
            System.out.println("\tIteration #" + (i + 1) +" operation 3\n");
        }
        System.out.println("Outer For loop terminated");
    }
}
