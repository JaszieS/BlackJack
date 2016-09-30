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
public class FaceCard extends Cards{
    
   //face cards has a value of 10. 1 or 11 when its an ace
    
    //default constructor
    FaceCard(){
        
        super("Face Card","Jack of ", "Diamonds", 10, false);
        
    }
    
    //arg constructor
    FaceCard(String faceName, String cardSuit, int cardValue, boolean flag){
        
        super("Face Card",faceName, cardSuit, cardValue, flag);
    }
    
    //if its an ace, user could pick 1 or 11 as value, methods will be filled later after the player class has been set
    void AceSetToOne(){
    
    
    }
    
    void AceSetToEleven(){
    
    
    }
}
