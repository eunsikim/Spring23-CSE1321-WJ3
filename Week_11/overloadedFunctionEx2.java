public class overloadedFunctionEx2 {
    // Int to Char conversion
    static void conversion(int decimal, char character){
        char response = (char)decimal;
        System.out.println(response);
    }

    // Char to Int conversion
    static void conversion(char character, int decimal){
        int response = (int)character;
        System.out.println(response);
    }

    public static void main(String[] args) {
        conversion(122, 'a');
    }
}
