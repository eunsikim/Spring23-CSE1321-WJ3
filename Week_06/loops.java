import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i++){
            System.out.print("i = " + i); 
        }
        
        int i = 0;
        
        while(i < 10){
            System.out.println("i = " + i);
        }

        do{
            System.out.println("i = " + i);
            i++;
        }while(i < 10);
    }
}
