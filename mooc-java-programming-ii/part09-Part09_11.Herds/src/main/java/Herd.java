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

public class Herd implements Movable {
    private ArrayList<Movable> herd; 
    
       
    public Herd(){
        this.herd = new ArrayList<>();
    }
    
    public String toString(){
        String res = "";
        for (Movable movable : this.herd){
            res += movable.toString() + "\n";
        }
        return res;
    }
    
    public void addToHerd(Movable movable){
        this.herd.add(movable);        
    }
    public void move(int dx, int dy){
        for (Movable movable : this.herd){
            movable.move(dx, dy);
        } 
    }
}
