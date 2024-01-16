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

public class Database {
    private HashMap<String, Bird> birds;
    
    public Database(){
        this.birds = new HashMap<>();
        
    }
    
    public void addBird(String name, String latinName){
        Bird newBird = new Bird(name, latinName); 
        birds.put(name, newBird); 
    }
    
    public void addBirdObs(String name){
        birds.get(name).increment();
    }
    
    public void printAllBirds(){
        for (String birdKey : this.birds.keySet()){
            System.out.println(this.birds.get(birdKey));
        }
    }
    
    public void printBird(String bird){
        System.out.println(this.birds.get(bird));
    }
    public boolean containsBird(String bird){
        return this.birds.containsKey(bird); 
    }
    public void incrementBird(String bird){
        this.birds.get(bird).increment();
    }
   
}
