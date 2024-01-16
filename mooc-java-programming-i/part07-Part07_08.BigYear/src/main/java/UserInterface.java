/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

import java.util.Scanner; 


public class UserInterface {
    private Database birds; 
    
    
    public UserInterface(){
        this.birds = new Database(); 
        
    }
    
    public void start(){
        Scanner scanner = new Scanner(System.in); 
        while (true){
            System.out.println("?");            
            String command = scanner.nextLine();
            
            if (command.equals("Quit")){
                break; 
            } else if (command.equals("Add")){
                System.out.println("Name: ");            
                String name = scanner.nextLine();
                System.out.println("Name in Latin: ");            
                String latinName = scanner.nextLine();
                this.birds.addBird(name, latinName);
                
            } else if (command.equals("Observation")){
                System.out.println("Bird? ");            
                String name = scanner.nextLine();
                if (this.birds.containsBird(name)){
                    this.birds.incrementBird(name); 
                } else {
                    System.out.println("Not a bird!");
                }
            } else if (command.equals("All")){
                this.birds.printAllBirds();
            } else if (command.equals("One")){
                System.out.println("Bird: ");            
                String name = scanner.nextLine();
                if (this.birds.containsBird(name)){
                    this.birds.printBird(name);
                } else {
                    System.out.println("Not a bird!");
                }
            }
        }

    }
}
