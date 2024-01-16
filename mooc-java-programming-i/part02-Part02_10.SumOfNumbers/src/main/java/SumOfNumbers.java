
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int x = 1;
        while (x != 0) {
            System.out.println("Give a number:");
            x = Integer.valueOf(scanner.nextLine());
            tries += x;
        }
        System.out.println("Sum of the numbers: " + tries);
    }

    
}