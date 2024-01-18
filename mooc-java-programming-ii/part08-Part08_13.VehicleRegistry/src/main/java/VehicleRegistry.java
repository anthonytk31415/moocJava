/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

import java.util.HashMap; 
import java.util.HashSet;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> reg;
    
    
    public VehicleRegistry(){
        this.reg = new HashMap<>();
        
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (this.reg.containsKey(licensePlate)){
            return false; 
        }
        this.reg.put(licensePlate, owner);         
        return true; 
    }
            
            
    public String get(LicensePlate licensePlate){
        return this.reg.get(licensePlate);
    }
            
            
    public boolean remove(LicensePlate licensePlate){
        if (this.reg.containsKey(licensePlate)){
            this.reg.remove(licensePlate);
            return true; 
        }
        return false; 
    }
    
    public void printLicensePlates(){
        for (LicensePlate plate : this.reg.keySet()){
            System.out.println(plate);
        }
    }
    public void printOwners(){
        HashSet<String> owners = new HashSet<>(this.reg.values());
        for (String owner : owners){
            System.out.println(owner);
        }
    }
}
