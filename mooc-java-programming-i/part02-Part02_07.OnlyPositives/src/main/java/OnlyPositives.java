
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (true) {
            System.out.println("Give a number:");
            x = Integer.valueOf(scanner.nextLine());
            if (x > 0) {
                System.out.println(Math.pow(x, 2));
            } else if (x < 0){
                System.out.println("Unsuitable number");
            } else {
                break; 
            }
        }
    }
}
