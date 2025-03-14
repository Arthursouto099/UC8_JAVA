/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessinggame;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class GuessingGame {
    static GuessingGameInit gameDisplay = new GuessingGameInit();
    static UserDisplay userDisplay = new UserDisplay();
    
    
    public static void main(String[] args) {
        GuessingGame game = new GuessingGame();   
        
        
                
        
        game.start();
        
        

        
        
        
        
        
        
    }
    
    
    public  void start() {
        this.gameDisplay.setVisible(true);
    }
    

}
