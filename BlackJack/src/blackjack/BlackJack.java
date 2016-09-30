/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author edsel
 */
public class BlackJack extends Application {
    
      
      //Instantiate an array of 20 cards
        final int DECKNUM = 20;
        Cards[] deck = new Cards[DECKNUM];
        
        //Initialize each of the array objects
        deck[0] = new FaceCard("Jack of ", "Diamonds", 10, false);
        deck[1] = new FaceCard("Jack of ", "Clubs", 10, false);
        deck[2] = new FaceCard("Jack of ", "Hearts", 10, false);
        deck[3] = new FaceCard("Jack of ", "Spades", 10, false);
        
        deck[4] = new FaceCard("Queen of ", "Diamonds", 10, false);
        deck[5] = new FaceCard("Queen of ", "Clubs", 10, false);
        deck[6] = new FaceCard("Queen of ", "Hearts", 10, false);
        deck[7] = new FaceCard("Queen of ", "Spades", 10, false);
        
        deck[8] = new FaceCard("King of ", "Diamonds", 10, false);
        deck[9] = new FaceCard("King of ", "Hearts", 10, false);
        deck[10] = new FaceCard("King of ", "Clubs", 10, false);
        deck[11] = new FaceCard("King of ", "Spades", 10, false);
        
        deck[12] = new numberCard("Two of ", "Diamonds", 2, false);
        deck[13] = new numberCard("Three of ", "Clubs", 3, false);
        deck[14] = new numberCard("Four of ", "Hearts", 4, false);
        deck[15] = new numberCard("Five of ", "Spades", 5, false);
        
        deck[16] = new numberCard("Six of ", "Diamonds", 6, false);
        deck[17] = new numberCard("Seven of ", "Clubs", 7, false);
        deck[18] = new numberCard("Eight of ", "Hearts", 8, false);
        deck[19] = new numberCard("Nine of " , "Spades", 9, false);
        
        //for loop which shows the info of each card
        for(int i = 0; i < DECKNUM; i++){
            
            System.out.println("Card " + (i+1) + ": " + deck[i].getCardName() + deck[i].getCardSuit()+ ". Value: " + deck[i].getCardValue() );
        }
        
        //shows the value of the cards
        System.out.println("\nCard 1 is a " + deck[0].getCardType() + ", it has a value of " + deck[0].getCardValue() + " in BlackJack");
        System.out.println("\nCard 13 is a " + deck[14].getCardType() + ", it has a value of its number in BlackJack");
        
        StackPane root = new StackPane();
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
