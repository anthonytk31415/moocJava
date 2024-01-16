
//import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sentence = "blah";
        String[] words = sentence.split(",");
        int ages = 0;
        int countAges = 0;
        String longestName = "";
        while (!sentence.equals("")){
            sentence = String.valueOf(scanner.nextLine());
            words = sentence.split(",");
            if (!sentence.equals("")){
                int curYear = Integer.parseInt(words[1]);
                String curName = words[0];
                countAges += 1;
                ages += curYear;
                
                if (curName.length() > longestName.length()) {
                    longestName = curName;
                }
            }
        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ages*1.0/countAges);
    }
}
