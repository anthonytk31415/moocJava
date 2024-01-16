
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here. 
        System.out.println("Give a year:");
        Integer myInt = Integer.valueOf(scanner.nextLine());
        if (myInt < 2015) {
            System.out.println("Ancient history!");
        } 
    }
}
