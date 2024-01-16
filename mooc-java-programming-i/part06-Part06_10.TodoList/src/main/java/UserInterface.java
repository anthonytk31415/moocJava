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
    private TodoList todoList; 
    private Scanner scanner; 
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.todoList = todoList;
        this.scanner = scanner;
    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String input = this.scanner.nextLine();
            if (input.equals("stop")){
                break; 
            } else if (input.equals("add")){
                System.out.println("To add:");
                String toAdd = this.scanner.nextLine();
                this.todoList.add(toAdd);
            } else if (input.equals("list")){
                this.todoList.print();
            } else if (input.equals("remove")){
                System.out.println("Which one is removed? ");
                Integer toRemove = Integer.parseInt(this.scanner.nextLine());
                this.todoList.remove(toRemove);
            }
        }
            
    }

}
