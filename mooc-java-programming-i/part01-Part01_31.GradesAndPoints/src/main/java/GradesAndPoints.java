
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        Integer myInt = Integer.valueOf(scan.nextLine());
        String msg = "";
        if (myInt < 0) {
            msg = "impossible!";
        } else if (myInt <50 ) {
            msg = "failed";
        } else if (myInt <60 ) {
            msg = "1";
        } else if (myInt <70 ) {
            msg = "2";
        } else if (myInt <80 ) {
            msg = "3";
        } else if (myInt <90 ) {
            msg = "4";
        } else if (myInt <=100 ) {
            msg = "5";
        } else {
            msg = "incredible!";
        }
        System.out.println("Grade: " + msg);
    }
}
