public class linearSearch {
    public static void main(String[] args) {
        int[] numbers = {23, 3, 0, -1, 1, 64, 5, 10, 2, 2, 67};
        int target = 100;
        boolean found = false;

        // Linearly search the value of 64
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                System.out.println("I have found the number.");
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("The number does not exist in the array");
        }
    }
}
