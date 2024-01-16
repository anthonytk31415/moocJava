
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tries = 0;
        int numTries = 0;
        int x = 1;
        while (x != 0) {
//            System.out.println("Give a number:");
            x = Integer.valueOf(scanner.nextLine());
            if (x > 0){
                tries += x;
                numTries += 1;
            }            
        }
        if (tries > 0){
            System.out.println(tries*1.0/numTries);      
        } else {
            System.out.println("Cannot calculate the average");
        }

    }

    
}