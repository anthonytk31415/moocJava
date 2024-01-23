/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.Random;
import java.util.ArrayList;
import java.util.List; 
/**
 *
 * @author anthonytk
 */
public class AverageSensor implements Sensor{
    
    private ArrayList<Sensor> sensors; 
    private List readings; 
    
    public AverageSensor(){
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }
    
    
    public boolean isOn(){
        for (Sensor sensor : this.sensors){
            if (!sensor.isOn()){
                return false; 
            }
        }
        return true; 
    }    
    
    public void setOn(){
        for (Sensor sensor : this.sensors){
            sensor.setOn();
        }

    }    
    public void setOff(){
        for (Sensor sensor : this.sensors){
            sensor.setOff();
        }

    }   
    public int read(){
        if (this.sensors.isEmpty() || !this.isOn()){
            throw new IllegalStateException("shit off or no sensors");
        }
        
        int sum = this.sensors.stream()
                .map(x -> x.read())
                .reduce(0, (x, y)-> x + y);
        
        int res = sum / this.sensors.size(); 
        this.readings.add(res);
        return res;
    }   
    
    
    public void addSensor(Sensor toAdd){
        this.sensors.add(toAdd);
    }
    
    public List<Integer> readings(){
        return this.readings; 
    }
}

