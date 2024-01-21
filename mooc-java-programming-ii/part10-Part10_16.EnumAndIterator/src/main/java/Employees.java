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
        this.employees.stream()
                .filter(x -> x.getEducation().equals(education))
                .forEach(person -> System.out.println(person));
    }
}
