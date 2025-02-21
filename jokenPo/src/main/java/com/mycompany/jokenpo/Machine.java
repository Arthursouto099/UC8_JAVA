/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Machine {
    private String name;
    
    public Machine(){
        this.name = "Roberto";
    }
    
    public int generatePlayint() {
        return (int) (Math.random() * 3) + 1;
    }
    
    
    public String convertPlayed(int number) {
       String gameString; 
        
       switch(number) {
           case 1:
               gameString = "Pedra";
               break;
           case 2:
               gameString =  "Papel";
               break;
           case 3:
               gameString =  "Tesoura";
               break;
           default: 
               gameString = "error";
               break;
       }
       
       return gameString;
       
   }
   
   
   
   public String getNameOfMachine() {
       return this.name;
   }
}

