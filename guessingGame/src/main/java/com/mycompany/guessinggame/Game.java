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
    private Player player;
    private GuessValidator guessValidator;
    private Scanner scanner;
    
    public Game() {
        this.numberToGuess = (int) (Math.random() * 100) + 1;
        this.player = new Player();
        this.guessValidator = new GuessValidator();
        this.scanner = new Scanner(System.in);
    }
    
   
    
    public void start() {
        System.out.println("Bem vindo(a) ao Guessing Game  " + this.player.getName());
        
        boolean hasWon = false;
        
        while(!hasWon) {
            System.out.println("Digite seu palpite: ");
            int guess = this.scanner.nextInt();
            hasWon = guessValidator.validateGuess(guess, this.numberToGuess);
        }
        
        System.out.println("Parabens, " + player.getName()+ " ! você adivinhou o numero " + "o numero é " + this.numberToGuess);
    }
}
