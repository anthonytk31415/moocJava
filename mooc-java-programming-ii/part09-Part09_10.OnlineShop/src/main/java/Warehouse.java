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
import java.util.HashSet;
import java.util.Set;

public class Warehouse {
    
    private Map<String, Integer> storage; 
    private Map<String, Integer> prices; 
    public Warehouse (){
        this.storage = new HashMap<>();
        this.prices = new HashMap<>();
    }    
 
    public void addProduct(String product, int price, int stock){
        this.storage.put(product, stock); 
        this.prices.put(product, price);
    }
    
    
    public int price(String product){
        if (!(this.prices.containsKey(product))){
            return -99;
        }
        return this.prices.get(product);
    }
    
    public int stock(String product){
        if (!(this.storage.containsKey(product))){
            return 0;
        }
        return this.storage.get(product);      
    }
    
    public boolean take(String product){
        if (!(this.storage.containsKey(product)) || this.storage.get(product) == 0){
            return false; 
        }        
        this.storage.put(product, this.storage.get(product) - 1); 
        return true; 
    }
    
    public Set<String> products(){
        return this.storage.keySet();
        
    }
}
