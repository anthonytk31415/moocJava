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
public class BoxWithMaxWeight extends Box {

    private int maxWeight;

    private ArrayList<Item> items; 
    
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;

        this.items = new ArrayList<>();
        
    }
    
    @Override
    public void add(Item item){
        
        int weight = 0;
        for (Item curItem : this.items){
            weight += curItem.getWeight();
        }
        
        if (item.getWeight() + weight <= this.maxWeight){
            this.items.add(item);
        }

    }
    
    @Override
    public boolean isInBox(Item item){        
        return this.items.contains(item);
    }
}
