
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class UserInterface {
    private Scanner scanner; 
    private Container cA; 
    private Container cB; 
    
    
    public UserInterface(Scanner scanner, Container cA, Container cB){
        this.scanner = scanner;
        this.cA = cA;
        this.cB = cB;
        
    }
    
    public void start(){

        while (true) {
            System.out.print("> ");
            System.out.println("First: " + this.cA);
            System.out.println("Second: " + this.cB);
            String input = this.scanner.nextLine();
            if (input.equals("quit")) {
                break;
            } 
            String[] parts = input.split(" "); 
            int qty = Integer.parseInt(parts[1]);
            if (parts[0].equals("add") && qty >= 0){
                this.cA.add(qty);
            } else if (parts[0].equals("move") && qty >= 0){
                int movedAmt = Math.min(this.cA.contains(), qty);
                
                this.cA.remove(movedAmt);
                this.cB.add(movedAmt); 
                
               
            } else if (parts[0].equals("remove") && qty >= 0){
                this.cB.remove(qty);
            }
    }
    
    
}

}
