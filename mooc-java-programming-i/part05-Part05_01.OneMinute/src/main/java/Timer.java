/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */
public class Timer {
    private ClockHand seconds; 
    private ClockHand hSeconds;
    
    public Timer() {
        this.seconds = new ClockHand(60);
        this.hSeconds = new ClockHand(100);
        
    }
    
    
    public void advance() {
        this.hSeconds.advance(); 
        if (this.hSeconds.value() == 0) {
            this.seconds.advance();
        }
          
    }
    public String toString() {
        return seconds + ":" + hSeconds;
    }
}
