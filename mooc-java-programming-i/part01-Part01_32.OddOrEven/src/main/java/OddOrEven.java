
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give a number:");
        Integer myInt = Integer.valueOf(scan.nextLine());
        if (myInt % 2 == 0) {
            System.out.println("Number " + myInt + " is even.");
        } else {
            System.out.println("Number " + myInt + " is odd.");
        }
    }
}
