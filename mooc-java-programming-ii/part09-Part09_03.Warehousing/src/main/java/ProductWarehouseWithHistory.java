/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class ProductWarehouseWithHistory extends ProductWarehouse{
    
    private ChangeHistory hist; 
              
    
    public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance){
        super(productName, capacity);
        this.hist = new ChangeHistory(); 

               
        this.addToWarehouse(initialBalance);

    }
    
    public String history(){
        return this.hist.toString(); 
    }
    
    public void addToWarehouse(double amount){
        super.addToWarehouse(amount);
        this.hist.add(this.getBalance());
    }
    
    public double takeFromWarehouse(double amount) {
        double res = super.takeFromWarehouse(amount);
        this.hist.add(this.getBalance());
        return res; 
    }
    
    public void printAnalysis(){
        System.out.println("Product: " + super.getName() + "\n");
        System.out.println("History: " + this.history() + "\n");        
        System.out.println("Largest amount of product: " + this.hist.maxValue() + "\n");                
        System.out.println("Smallest amount of product: " + this.hist.minValue() + "\n");  
        System.out.println("Average: " + this.hist.average());  
    }
}
