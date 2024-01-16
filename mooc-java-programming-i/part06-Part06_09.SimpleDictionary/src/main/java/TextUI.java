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

public class TextUI {

    private Scanner scanner; 
    private SimpleDictionary dictionary; 

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
   
        
    public void start(){
        while (true){            
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("end")){
                System.out.println("Bye bye!");
                break; 
            } else if (input.equals("add")){
                System.out.println("Word:");
                String wordKey = this.scanner.nextLine();
                System.out.println("Translation:");
                String wordVal = this.scanner.nextLine();
                this.dictionary.add(wordKey, wordVal); 
            } else if (input.equals("search")){
                System.out.println("To be translated:");
                String wordKey = this.scanner.nextLine();
                if (this.dictionary.translate(wordKey) == null){
                    System.out.println("Word " + wordKey + " was not found");
                } 
                else {
                    System.out.println("Translation: " + this.dictionary.translate(wordKey));
                    
                }
            } else {
                System.out.println("Unknown command");
            }
            
            
        }
    }
}
