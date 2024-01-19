/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

import java.util.Map;
import java.util.HashMap;

public class ShoppingCart {
        
    private Map<String, Item> cart; 
    
    public ShoppingCart(){
        this.cart = new HashMap<>();              
    }
    
    public void add(String product, int price){
        if (this.cart.containsKey(product)){
            this.cart.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.cart.put(product, item);
        }        
    }
    
    public int price(){
        int totalPrice = 0;
        for (String product : this.cart.keySet()){
            totalPrice += this.cart.get(product).price();
        }
        return totalPrice; 
    }
    
    public void print(){
        for (String product : this.cart.keySet()){
            System.out.println(this.cart.get(product));
        }
    }
}
