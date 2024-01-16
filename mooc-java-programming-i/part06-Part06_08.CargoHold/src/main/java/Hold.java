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

public class Hold {
    private int maxWeight; 
    private ArrayList<Suitcase> suitcases; 
    private int curWeight;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();
        this.curWeight = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (curWeight + suitcase.totalWeight() <= maxWeight){
            curWeight += suitcase.totalWeight();
            suitcases.add(suitcase);            
        }
    }
//    "x suitcases (y kg)
    public String toString(){
        return this.suitcases.size() + " suitcases (" + this.curWeight + " kg)";
    }
    
    public void printItems(){
        System.out.println("The suitcases in the hold contain the following items:");
        for (Suitcase suitcase : suitcases){
            suitcase.printItems();
        }
    }
}
