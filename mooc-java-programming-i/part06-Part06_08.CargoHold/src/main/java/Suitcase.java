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

public class Suitcase {
 
    private ArrayList<Item> items;  
    private int maxWeight; 
    private int curWeight; 
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.curWeight = 0;
        this.items = new ArrayList<>();
        
    }
    
    public void addItem(Item item){
        if (this.curWeight + item.getWeight() <= maxWeight){
            this.items.add(item);
            this.curWeight += item.getWeight();
        } 

    }
    public String toString(){
        if (this.items.size() == 0){
            return "no items (0 kg)";
        } else if (this.items.size() == 1){
            return "" + this.items.size() + " item (" + this.curWeight + " kg)"; 
        }
        return "" + this.items.size() + " items (" + this.curWeight + " kg)"; 
    }    
             
    public int totalWeight(){
        return curWeight; 
    }
    
    public void printItems(){
//        System.out.println("The suitcase contains the following items:");
        for (Item item : this.items){
            System.out.println(item);
        }
    }
    
    public Item heaviestItem(){
        if (items.isEmpty()){
            return null;
        }
        Item res = items.get(0);
        for (Item item : items){
            if (item.getWeight() > res.getWeight() ){
                res = item; 
            }
        }
        return res;         
    }
    
    
}
