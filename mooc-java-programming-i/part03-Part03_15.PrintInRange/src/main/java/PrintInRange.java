
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
    }
    public static void printNumbersInRange(ArrayList<Integer> numbers, int lower, int upper){
        for (int num : numbers) {
            if (num >= lower && num <= upper) {
                System.out.println(num);
            }
        }
    }
}
