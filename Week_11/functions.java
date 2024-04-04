public class functions {
    // f(x) = x - 5;
    static double someFormula(double x){
        double calculation = x - 5;

        return calculation;
    }

    static void printArray(int numbers[]){
        System.out.println("[Printing Array]");
        for(int i = 0; i < numbers.length; i++){
            System.out.println("- " + numbers[i]);
        }
    }
    
    static int[] initializeArray(){
        int[] array = {3, 5, 10, 9};

        return array;
    }

    public static void main(String[] args) {
        double someNumber = someFormula(3.14);
        System.out.println(someNumber);

        System.out.println(someFormula(3.14));

        int numbers[] = initializeArray();

        printArray(numbers);
    }
}
