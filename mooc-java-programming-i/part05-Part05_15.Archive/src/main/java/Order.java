/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

public class Order {

    private String id;
    private String name;

    public Order(String id, String name) {
        this.id = id;
        this.name = name;
    }
    public String getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }
    
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Order)){
            return false; 
        }
        
        Order cOrder = (Order) compared; 
        return this.name.equals(cOrder.name) && this.id.equals(cOrder.id); 
    }
    

}

