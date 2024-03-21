public class bubbleSort {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 0, -1, 1, 64, 5, 10, 2, 2, 67};

        System.out.println("[UN-SORTED]");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }

        for(int i = 0; i < numbers.length - 1; i++){
            for(int j = 0; j < numbers.length - i - 1; j++){
                if(numbers[j] > numbers[j + 1]){
                    //  Swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\n[SORTED]");
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + ", ");
        }
    }
}
