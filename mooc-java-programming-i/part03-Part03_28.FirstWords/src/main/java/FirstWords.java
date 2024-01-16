
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "blah";
        String[] words = sentence.split(" ");
        while (!sentence.equals("")){
            sentence = String.valueOf(scanner.nextLine());
            words = sentence.split(" ");
            
            System.out.println(words[0]);

        }
    }
}
