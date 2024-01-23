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
import java.util.Collections;
import java.util.Comparator;

public class Hand implements Comparable<Hand>{
    
    private ArrayList<Card> hand;
    
    public Hand (){
        this.hand = new ArrayList<>();
    }
    
    public void add(Card card){
        this.hand.add(card);
    }
    
    public void print(){
        this.hand.stream()
                .forEach(x -> System.out.println(x));
    } 
    
    public int sumHand(){
        return this.hand.stream()
                .map(x -> x.getValue())
                .reduce(0, (x, y) -> x + y);                                         
    }
    
    public void sort() {
        Collections.sort(hand);
    }
    
//    private Comparator<Hand> handComparator = Comparator
//            .comparing((Hand x) -> x.sumHand());
    
    @Override
    public int compareTo(Hand otherHand){
        return this.sumHand() - otherHand.sumHand();
    }

    
    public void sortBySuit(){
        BySuitInValueOrder sortSuit = new BySuitInValueOrder();
        Collections.sort(hand, sortSuit);
    }
}
