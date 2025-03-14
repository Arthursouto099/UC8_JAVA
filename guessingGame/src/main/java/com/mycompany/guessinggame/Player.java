/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guessinggame;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Player {
     private String name;
     private String email;
     
     public Player(String name, String email) {
         
         this.name = name;
         this.email = email;
     }
     
     public String getName(){
         return this.name;
     }
     
     public String getEmail() {
         return this.email;
     }
     
}
