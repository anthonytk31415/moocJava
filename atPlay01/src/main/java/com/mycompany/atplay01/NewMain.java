/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.atplay01;

/**
 *
 * @author anthonytk
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hello world");
        Counter counter = new Counter();
        Counter superCounter = new SuperCounter();
        int number = 3;
        number = superCounter.subtractFromNumber(number);
        number = superCounter.subtractFromNumber(number);
        number = counter.addToNumber(number);
        System.out.println(number);
    }
    
}
