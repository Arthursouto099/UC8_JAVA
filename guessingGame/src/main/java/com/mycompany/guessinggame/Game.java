/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

import java.util.Scanner;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Game {
    int numberToGuess ;
    private GuessValidator guessValidator;
    int attempts = 0;
    int win = 0;

    
    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.guessValidator = new GuessValidator();
      
    }
    
   
    
    public void start(javax.swing.JLabel text, int guess, String name, String email) {
            guess = guessValidator.validateGuess(guess, this.numberToGuess);
            if(guess == 0) {
                this.attempts += 1;
                text.setText("SEU NÚMERO É MUITO ALTO");
            }
            
            else if(guess == 1) {
                this.attempts += 1;
                text.setText("SEU NÚMERO É MUITO BAIXO.");
            }
            
            else {
                text.setText("PARABÉNS " + name + ", DONO DO EMAIL: " + email + "-------> VOCÊ GANHOU");
                this.win += 1;
            }
        
        
        
        
        
    }
}
