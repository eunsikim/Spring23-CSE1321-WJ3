import java.util.Scanner;

public class overloadedFunctionsEx1 {
    public static void process_Payment(){
        System.out.println("Re-directing to Paypal");
    }

    public static void process_Payment(String creditCardInfor){
        System.out.println("Processing your payment");
    }
    public static void main(String[] args) {
        String method;

        Scanner sc = new Scanner(System.in);

        System.out.println("Order Summary");
        System.out.println("Items:\t\t\t$2,199.99");
        System.out.println("Shipping:\t\t$0.00");
        System.out.println("Total before Tax:\t$2,199.99");
        System.out.println("Tax:\t\t\t$132.00");
        System.out.println("Total:\t\t\t$2,331.99");

        System.out.print("Enter Payment Method (Credit/Paypal): ");
        method = sc.nextLine();

        if(method.equalsIgnoreCase("Paypal")){
            process_Payment();
        }
        else if(method.equalsIgnoreCase("Credit")){
            String credit;
            System.out.print("Enter Credit card information: ");
            credit = sc.nextLine();
            process_Payment(credit);
        }
    }
}
