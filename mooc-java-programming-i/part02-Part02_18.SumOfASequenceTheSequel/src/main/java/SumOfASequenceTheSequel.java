
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number? ");
        int x = Integer.valueOf(scanner.nextLine());
        System.out.println("Last number? ");  
        int y = Integer.valueOf(scanner.nextLine());
        int n = (y - x) + 1;
        System.out.println("The sum is " + n*(x + y)/2);
    }
}
