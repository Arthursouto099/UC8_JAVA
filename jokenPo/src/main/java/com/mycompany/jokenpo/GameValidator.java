/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class GameValidator {

    public int validateGame(String player, String machine) {
        
      
        
        
        if(("Tesoura".equals(player) == false) && ("Pedra".equals(player) == false) && ("Papel".equals(player) == false)) {
            System.out.println("Tipo de dado invalido.");
            return 3;
        }
        
        
        String choiceMachine = machine ;
        String template = "Maquina" + " escolheu " + choiceMachine;
        String templateWinner = player + " Ganha de " + choiceMachine + ", Você Ganhou!!!!!"  ;
        String templateDefeat = choiceMachine + " Ganha de " + player + ", Você Perdeu"  ;
        
        if(("Tesoura".equals(player) && "Papel".equals(choiceMachine)) ||
           ("Pedra".equals(player) && "Tesoura".equals(choiceMachine)) ||
           ("Papel".equals(player) && "Pedra".equals(choiceMachine))    ) {
            System.out.println(template);
            System.out.println(templateWinner);
            return 1;
        }
        
        else if(("Papel".equals(player) && "Tesoura".equals(choiceMachine)) ||
            ("Pedra".equals(player) && "Papel".equals(choiceMachine)) ||
            ("Tesoura".equals(player) && "Pedra".equals(choiceMachine)))  {
            System.out.println(template);
            System.out.println(templateDefeat);
            return 2;
        }
        
        else {
            System.out.println("ufa, passou, vocês escolheram a mesma jogada.");
            System.out.println(template);
            return 0;
        }
        
        
           
    }
    

}
