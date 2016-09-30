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
public abstract class Cards {
    //private variables for the cards class
    private String cardType; //either a face card or a number card
    private String cardSuit; //suit of the card, Diamonds, Clubs, Hearts, Spades
    private int cardValue; //Value of the cards in blackjack
    private boolean cardPlayed; //bool to show if the card is played
    private String cardName; //name of the card
    
    //default constructor
    Cards(){
     
        setCardType("Number Card");
        setCardName("Two of ");
        setCardSuitType("Diamonds");
        setCardValue(2);
        setCardPlayed(false);
    }
    
    //arg constructor
    Cards(String type, String name, String suit, int value, boolean flag){
        
        setCardType(type);
        setCardName(name);
        setCardSuitType(suit);
        setCardValue(value);
        setCardPlayed(flag);
    }
    
    //setters
    public void setCardType(String type){
        
        cardType = type;
    }
    
    public void setCardSuitType(String suit){
        cardSuit = suit;
    }
    
    public void setCardValue(int value){
        cardValue = value;
    }
    
    public void setCardPlayed(boolean flag){
        
        cardPlayed = flag;
    }
    
    public void setCardName(String name){
        
        cardName = name;
    }
    
    
    //getters
    public String getCardType(){
        return cardType;
    }
    
    public String getCardSuit(){
        
        return cardSuit;
    }
    
    public int getCardValue(){
        
        return cardValue;
    }
    
    public boolean getCardPlayed(){
        
        return cardPlayed;
    }
    
    public String getCardName(){
        return cardName;
    }
    
}
