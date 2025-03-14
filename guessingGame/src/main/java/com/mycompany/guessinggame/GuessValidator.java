/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class GuessValidator {
        
    public int validateGuess (int guess, int numberToGuess) {
        if(guess > numberToGuess){
            return 0;
        } else if (guess < numberToGuess) {
            return 1;
        } else {
            return 2;
        }
        
    }
}
