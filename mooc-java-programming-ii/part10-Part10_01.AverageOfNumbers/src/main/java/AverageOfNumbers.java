
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here
        ArrayList<Integer> nums = new ArrayList<>();             
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true) {
            String curLine = scanner.nextLine(); 
            if (curLine.equals("end")){
                break; 
            }
            nums.add(Integer.parseInt(curLine));
        }

        double res = nums.stream().mapToInt(s -> Integer.valueOf(s)).average().getAsDouble();
        System.out.println("average of the numbers: " + res);
    }
}
