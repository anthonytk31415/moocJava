
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "blah";
        String[] words = sentence.split(",");
        int age = -1; 
        String name = "";
        while (!sentence.equals("")){
            sentence = String.valueOf(scanner.nextLine());
            words = sentence.split(",");
            if (!sentence.equals("")){
                int curAge = Integer.parseInt(words[1]);
                if (curAge > age) {
                    name = words[0];
                    age = curAge;
                }
            }
        }
        System.out.println("Age of the oldest: " + age);
    }
}
