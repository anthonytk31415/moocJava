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

public class IOU {
    private HashMap<String, Double> tracker;
    
    public IOU(){
        this.tracker = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount){
        this.tracker.put(toWhom, amount); 
    }
    
    public double howMuchDoIOweTo(String toWhom){
        return this.tracker.getOrDefault(toWhom, 0.0); 
    }
}
