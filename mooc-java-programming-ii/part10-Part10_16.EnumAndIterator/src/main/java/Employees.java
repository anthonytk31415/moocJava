/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
import java.util.List; 
import java.util.ArrayList; 
import java.util.Iterator;

public class Employees {
    private ArrayList<Person> employees; 
        
    public Employees (){
        this.employees = new ArrayList<>();
        
    }
    
    
    public void add(Person personToAdd){
        this.employees.add(personToAdd);
    }
    public void add(List<Person> peopleToAdd){
        this.employees.addAll(peopleToAdd);
    }
    public void print(){
        this.employees.stream()
                .forEach(person -> System.out.println(person));
        
    }
    
    public void print(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()){
            Person curNext = iterator.next(); 
            if (curNext.getEducation().equals(education)){
                System.out.println(curNext); 
            }
        }
    }
    
    public void fire(Education education){
        Iterator<Person> iterator = this.employees.iterator();
        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)){
                iterator.remove(); 
            }
        }
    }
}
