/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class Bird {
    private int observations;
    private String name; 
    private String latinName; 
    
    public Bird(String name, String latinName){
        this.name = name; 
        this.latinName = latinName; 
        this.observations = 0;
    }
    
    public void increment(){
        this.observations += 1;
    }
    
    public String getLatinName(){
        return this.latinName; 
    }
    
    public String toString(){
        return this.name + " (" + this.latinName +  "): " + this.observations + " observations";
    }
    
}
