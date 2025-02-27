/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class NaraClan extends Clan {
    
    public NaraClan() {
        this.setLeader("Shikamaru");
        this.setNameOfClan("Nara");
    }
  
    
    

    @Override
    public void specialAbility() {
    System.out.println("Hablidade Special: Manipulação das Sombras"); 
    this.lineDisplay();
    }
    
}
