/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

import java.util.ArrayList;

public class Stack {
    
    private ArrayList<String> stack; 

    public Stack () {
        this.stack = new ArrayList<>();         
    }
    
    public boolean isEmpty() {
        return this.stack.isEmpty();
    }
    
    public void add(String value){
        this.stack.add(value);
    }
    
    public ArrayList<String> values(){
        return this.stack; 
    }
    
    public String take(){
        if (!(this.isEmpty())){
            int last = this.stack.size() - 1; 
            String popped = this.stack.get(last);
            this.stack.remove(last);  
            return popped; 
        }
        return "error";
    }
}
