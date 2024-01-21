
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inputs = new ArrayList<>();
        while (true){
            String curInput = scanner.nextLine();
            if (curInput.equals("")){
                break; 
            }
            
            
            inputs.add(curInput);
        }
        inputs.forEach(x -> System.out.println(x));
    }
}
