/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anthonytk
 */

import java.util.Comparator; 

public class BySuitInValueOrder implements Comparator<Card>{
    public int compare(Card x, Card y){
        if (x.getSuit().equals(y.getSuit())){
            return x.getValue() - y.getValue();
        }
        return x.getSuit().ordinal() - y.getSuit().ordinal(); 
    }
 
//    
//    @Override
//    public int compareTo(Card otherCard){
//        return this.cardComparator.compare(this, otherCard);
//    }
}
