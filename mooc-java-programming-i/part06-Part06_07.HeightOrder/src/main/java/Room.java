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
//import java.util.PriorityQueue;
//import java.util.Comparator; 

public class Room {
//    private PriorityQueue<Person> persons; 
    private ArrayList<Person> persons; 

    public Room(){
//        this.persons = new PriorityQueue<Person>((a,b) -> a.getHeight() - b.getHeight());
        this.persons = new ArrayList<Person>(); 
    }
    
    
    public void add(Person person){
        this.persons.add(person);
//        this.personsArrayList.add(person);
    }
    
    public boolean isEmpty() {
        return this.persons.isEmpty(); 
    }
    
    public ArrayList<Person> getPersons(){        
        return this.persons; 
    }
    
    
    public Person shortest(){
        if (this.persons.isEmpty()){
            return null;
        }        
        Person res = persons.get(0);
        for (Person person: this.persons){
            if(person.getHeight() < res.getHeight()){
                res = person;
            }
        }        
        return res;
    }
    
    public Person take(){
        if (!(this.persons.isEmpty())){
            Person shortest = this.shortest();
            this.persons.remove(shortest);
            return shortest; 
        } else {
            return null;
        }

    }

}