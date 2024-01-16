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

public class Package {
    
    private ArrayList<Gift> gifts; 
//    private int totalWeight; 
    
    public Package(){
        this.gifts = new ArrayList<>();
//        this.totalWeight = 0;
        
    }
    
    public void addGift(Gift gift){
//        this.totalWeight += gift.getWeight();
        gifts.add(gift);
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        for (Gift gift : gifts){
            totalWeight += gift.getWeight();
        }
        return totalWeight; 
    }
}
