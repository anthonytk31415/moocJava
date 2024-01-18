
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container cA = new Container();
        Container cB = new Container();
        
        UserInterface ui = new UserInterface(scan, cA, cB); 
        ui.start();

        

    }
}


