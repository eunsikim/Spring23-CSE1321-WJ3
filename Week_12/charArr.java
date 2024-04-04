
public class charArr {
    public static void main(String[] args) {
        String word = "Hello World";
        
        for(int i = 0; i < word.length(); i++){
            System.out.print(word.charAt(i));
        }
        System.out.println();

        char wordC[] = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o','r','l', 'd'};
        for(int i = 0; i < wordC.length; i++){
            System.out.print(wordC[i]);
        }
    }
}
