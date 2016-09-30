/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author edsel
 */
public class numberCard extends Cards{
    
    
    //number cards has value according to its number, and has the value number card by default
    numberCard(){
        
        super("Number Card","Two of", "Diamonds", 2, false);
       
    }
    
    //arg contructor
    numberCard(String cardNumber, String cardSuit, int cardValue, boolean flag){
        
        super("Number Card",cardNumber, cardSuit, cardValue, flag);
        
    }
    
   
    
}
