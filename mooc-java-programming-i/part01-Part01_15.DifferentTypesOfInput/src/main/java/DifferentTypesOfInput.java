
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String myString = String.valueOf(scan.nextLine());
        
        System.out.println("Give an integer:");
        Integer myInt = Integer.valueOf(scan.nextLine());
        
        System.out.println("Give a double:");
        Double myDouble = Double.valueOf(scan.nextLine());
        
        System.out.println("Give a boolean:");
        Boolean myBoolean = Boolean.valueOf(scan.nextLine());
        
        System.out.println("You gave the string " + myString);
        System.out.println("You gave the integer " + myInt);
        System.out.println("You gave the double " + myDouble);
        System.out.println("You gave the boolean " + myBoolean);        
    }
}
