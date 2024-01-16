
import java.util.ArrayList;
import java.util.Scanner;

public class GreatestInList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        int maxVal = Integer.MIN_VALUE;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
            maxVal = Math.max(maxVal, input);
        }
        
        System.out.println("");

        // implement finding the greatest number in the list here
        System.out.println("The greatest number: " + maxVal);
    }
}
