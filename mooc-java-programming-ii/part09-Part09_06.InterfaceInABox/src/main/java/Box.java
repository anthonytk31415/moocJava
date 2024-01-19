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

public class Box implements Packable{
    private double maxCapacity; 
//    private double curWeight; ;
    private ArrayList<Packable> items; 
    
    public Box (double maxCapacity) {
        this.maxCapacity = maxCapacity; 
//        this.curWeight = 0;
        this.items = new ArrayList<>();        
    }
    
    public void add(Packable item){
        if (item.weight() + this.weight() <= maxCapacity){
            this.items.add(item);        
        }
    }
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + " kg";
    }
    
    public double weight(){
        double weight = 0;
        for (Packable item : this.items){
            weight += item.weight();
        }
        return weight; 
    }
}
