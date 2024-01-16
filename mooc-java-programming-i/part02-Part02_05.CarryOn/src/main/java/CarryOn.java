
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = "blah";
        String y = "no";
        while (!x.equals(y)) {
            System.out.println("Shall we carry on?");
            x = String.valueOf(scanner.nextLine());
        }
    }
}
