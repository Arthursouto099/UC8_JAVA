/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;
import java.util.Scanner;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Game {
    Machine machine;
    Player player;
    GameValidator gameValidator;
    Scanner scan;
    
    public Game() {
        machine = new Machine();
        player = new Player();
        gameValidator = new GameValidator();
        scan = new Scanner(System.in);
    }
    
    
    public void start() {
        System.out.print("Bem vindo ao meu game, " + this.player.getName());
        System.out.println("\n");
        
        
        int playerScore = 0;
        int machineScore = 0;
        int draw = 0;
        
        while(true) {
            
             if(playerScore >= 2) {
            System.out.println("Você ganhou");
            break;
          
             }
        
            else if(machineScore >= 2) {
            System.out.println("Você perdeu");
            break;
            }
            
            System.out.println("\n");
            System.out.println("Player, " +  playerScore);
            System.out.println("Machine, " + machineScore);
            System.out.println("Empate, " + draw);
            System.out.println("\n");
            if((playerScore == 1) &&  (machineScore == 1) && (draw < 1))  {
                System.out.println("Hora de ver quem vai vencer: 1 a 1:  ");
            }
            if((draw == 3) || (playerScore >= 1 &&  machineScore >= 1 && draw >= 1)) {
                System.out.println("Iniciando mata mata, quem ganhar ganhou!");
            }
            System.out.println("Escolha entre Pedra, Papel ou Tesoura: ");
            String playerChoice = scan.nextLine();
            
            
           int randomIntPlayed = machine.generatePlayint();
           String played = machine.convertPlayed(randomIntPlayed);
            
           int validator = gameValidator.validateGame(playerChoice, played);
           
            if(draw == 3) {
                if(validator == 1) {
                    playerScore += 3; 
                  
                }
                
                else if(validator == 2) {
                    machineScore += 3;
                }
                
            }
           
           
           switch(validator) {
               case 1:
                    playerScore += 1;
                    break;
               case 2:
                   machineScore += 1;
                   break;
               case 0:
                   draw += 1;
                   
           }
           
            
           
            
        
            
        }
        
        
      
        
        
    }
    
    
}
