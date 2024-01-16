
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        int arrMin = Integer.MAX_VALUE;
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
            arrMin = Math.min(arrMin, input);            
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        System.out.println("");
        System.out.println("Smallest number: " + arrMin);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == arrMin){
                System.out.println("Found at index: " + i);
            }
            
        }
        
    }
}
