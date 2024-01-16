/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class Fitbyte {
    private int age; 
    private int hr; 
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age; 
        this.hr = restingHeartRate; 
    }
    
    public double targetHeartRate(double percentageOfMaximum){
        
        
        return (206.3 - (0.711 * this.age) ) * percentageOfMaximum;
    }
    
    
}
