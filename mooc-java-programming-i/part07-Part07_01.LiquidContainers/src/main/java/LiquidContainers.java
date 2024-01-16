
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxLimit = 100;
        int containerA = 0;
        int containerB = 0;

        while (true) {
            System.out.print("> ");
            System.out.println("First: "+ containerA + "/" + maxLimit);
            System.out.println("Second: "+ containerB + "/" + maxLimit);
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            String[] parts = input.split(" "); 
            int qty = Integer.parseInt(parts[1]);
            if (parts[0].equals("add") && qty >= 0){
                containerA = Math.min(maxLimit, containerA + qty);
            } else if (parts[0].equals("move") && qty >= 0){
                int movedAmt = Math.min(containerA, qty);
                containerA = Math.max(containerA - qty, 0);
                containerB = Math.min(maxLimit, movedAmt + containerB);
            } else if (parts[0].equals("remove") && qty >= 0){
                containerB = Math.max(0, containerB - qty);
            }
            

        }
    }

}
