/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class Hideout<T> {
    private T hidden; 
    
    public Hideout(T hidden){
        this.hidden = hidden;
    }
    
    
    public void putIntoHideout(T toHide){
        this.hidden = toHide; 
    }
    
    public T takeFromHideout(){
        T res = this.hidden;
        this.hidden = null;
        return res; 
    }
    
    public boolean isInHideout(){
        return hidden != null; 
        
    }
            
}
