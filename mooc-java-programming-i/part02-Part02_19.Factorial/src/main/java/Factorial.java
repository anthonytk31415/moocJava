
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int x = Integer.valueOf(scanner.nextLine());
        int res = 1;
        while (x > 1) {
            res *= x;
            x -= 1;
        }
        System.out.println("Factorial: " + res);
    }
}
