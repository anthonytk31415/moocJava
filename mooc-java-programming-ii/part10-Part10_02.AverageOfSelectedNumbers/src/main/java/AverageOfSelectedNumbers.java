
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> nums = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String curLine = scanner.nextLine();
            if (curLine.equals("end")) {
                break;
            }
            nums.add(Integer.parseInt(curLine));
        }

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String response = scanner.nextLine();
        double res = 0.0;
        if (response.equals("n")){
            res = nums.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(x ->  x < 0  )
                .average()
                .getAsDouble();
            System.out.println("average of the negative numbers: " + res);
        } else {            
            res = nums.stream()
                .mapToInt(s -> Integer.valueOf(s))
                .filter(x ->  x > 0  )
                .average()
                .getAsDouble();
            System.out.println("average of the positive numbers: " + res);
        }
    }
}

