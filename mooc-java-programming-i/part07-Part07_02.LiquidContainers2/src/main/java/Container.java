/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class Container {
    private int amt; 
    
    public Container(){
        this.amt = 0;
    }
    
    public int contains(){
        return this.amt; 
    }
    
    public void add(int amount){
        if (amount >= 0){
            this.amt = Math.min(100, amount + this.amt); 
        }
    }
    
    public void remove(int amount){
        if (amount >= 0){
            this.amt = Math.max(0, this.amt - amount);
        }
    }
    
    public String toString(){
        return this.amt + "/100";
    }
}
