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

public class ChangeHistory {
    private ArrayList<Double> hist; 
    
    public ChangeHistory(){
        this.hist = new ArrayList<>();        
    }
    
    public void add(double status){
        this.hist.add(status);
    }
    
    public void clear(){
        this.hist.clear();
    }
    
    public String toString(){
        return this.hist.toString();
    }
    
    public double maxValue(){
        double res = 0;
        for (double num: this.hist){
            res = Math.max(res, num);
        }
        return res; 
    }
    
    public double minValue(){
        if (this.hist.isEmpty()){
            return 0; 
        }
        double res = Double.POSITIVE_INFINITY;
        for (double num: this.hist){
            res = Math.min(res, num);
        }
        return res; 
    }
    
    public double average(){
        double res = 0;
        if (this.hist.isEmpty()){
            return res; 
        }
        for (double num: this.hist){
            res += num;
        }
        return res*1.0/this.hist.size(); 
    }
    
    
}
