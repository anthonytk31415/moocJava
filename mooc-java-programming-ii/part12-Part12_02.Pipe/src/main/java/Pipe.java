/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
import java.util.ArrayDeque;

public class Pipe<T> {
    
    private ArrayDeque<T> deque; 
    
    public Pipe(){
        this.deque = new ArrayDeque<>();
    }
    
    public void putIntoPipe(T value){
        this.deque.addLast(value);
    }
    public T takeFromPipe(){
        return this.deque.removeFirst(); 
    }
    
    public boolean isInPipe(T target){
        return deque.contains(target);
    }
}
