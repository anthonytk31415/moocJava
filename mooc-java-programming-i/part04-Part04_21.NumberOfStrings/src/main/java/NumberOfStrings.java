
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true){
            String line = scanner.nextLine();
            if (line.equals("end")){
                break;
            }
            counter += 1;
            
            
        }
        System.out.println(counter);
    }
}
