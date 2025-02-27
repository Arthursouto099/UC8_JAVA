/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public abstract class Clan {
   private String nameOfCla;
   private String leader;
   
   
   public String getLeader() {
       return this.leader;
   }
   
   public void setLeader(String leader) {
       this.leader = leader;
   }
   
   public String getNameOfClan() {
       return this.nameOfCla;
   }
   
   public void setNameOfClan(String nameOfClan) {
       this.nameOfCla = nameOfClan;
   }
   
    void lineDisplay() {
       System.out.println("<------------------------------->");
   }
   
   
   public abstract void specialAbility();
   
   public void getDetails() {
       System.out.println("NameOfCla: " + this.nameOfCla);
       System.out.println("Leader: " + this.leader);

       
   }
   
   public void specialAtack(String messageAtack) {
       System.out.println("Ataque especial do cla: " + this.nameOfCla);
       System.out.println("Dono do ATAQUE" + this.leader);
       System.out.println("Ataque Especial: " + messageAtack);
       this.lineDisplay();
   }
   
    
    
    
}
