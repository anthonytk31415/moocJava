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
import java.util.HashMap; 

public class StorageFacility {
    private HashMap<String, ArrayList<String>> store; 

    public StorageFacility(){
        this.store = new HashMap<>();
    }
    
    
    public void add(String unit, String item){
        this.store.putIfAbsent(unit, new ArrayList<>()); 
        this.store.get(unit).add(item); 
        
    }
    
    public ArrayList<String> contents(String storageUnit){
        return this.store.getOrDefault(storageUnit, new ArrayList<String>());        
    }
    
    public void remove(String storageUnit, String item){
        ArrayList curUnit = this.store.get(storageUnit);
        curUnit.remove(item);
        if (curUnit.isEmpty()){
            this.store.remove(storageUnit);
        }
    }
    public ArrayList<String> storageUnits(){
        return new ArrayList<>(this.store.keySet());        
    }
}
