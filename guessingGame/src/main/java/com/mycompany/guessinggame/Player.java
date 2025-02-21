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
public class Player {
     private String name;
     
     public Player() {
         Scanner myScan = new Scanner(System.in);
         System.out.println("Digite seu nome: ");
         this.name = myScan.nextLine();
     }
     
     public String getName(){
         return this.name;
     }
     
}
