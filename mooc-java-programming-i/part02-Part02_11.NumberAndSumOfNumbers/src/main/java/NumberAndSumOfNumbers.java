
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int numTries = 0;
        int x = 1;
        while (x != 0) {
            System.out.println("Give a number:");
            x = Integer.valueOf(scanner.nextLine());
            if (x != 0){
                tries += x;
                numTries += 1;
            }            
        }
        System.out.println("Number of numbers: " + numTries);
        System.out.println("Sum of the numbers: " + tries);
    }

    
}