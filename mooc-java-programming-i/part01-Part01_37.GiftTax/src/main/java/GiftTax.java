
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int gift = Integer.valueOf(scan.nextLine());
        int lower = 0;
        int base = 0;
        double taxRate = 0;
        if (gift < 5000){
            System.out.println("No tax!");
        } else {
            if (gift < 25000 && gift >= 5000 ) {
                base = 100;
                lower = 5000;
                taxRate = .08;
            } else if (gift < 55000 ) {
                base = 1700;
                lower = 25000;
                taxRate = .10;
            } else if (gift < 200000 ) {
                base = 4700;
                lower = 55000;
                taxRate = .12;
            } else if (gift < 1000000 ) {
                base = 22100;
                lower = 200000;
                taxRate = .15;
            } else if (gift >= 1000000){
                base = 142100;
                lower = 1000000;
                taxRate = .17;
            } 
            Double res = (base + (gift - lower)*taxRate);
            System.out.println("Tax: " + res);
        }


    }
}
