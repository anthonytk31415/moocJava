
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        while (true){
            int curInput = Integer.parseInt(scanner.nextLine());
            if (curInput < 0){
                break; 
            }
            inputs.add(curInput);
        }
        inputs.stream()
                .filter(x -> x >= 1 && x <= 5)
                .forEach(x -> System.out.println(x));
    }

}
