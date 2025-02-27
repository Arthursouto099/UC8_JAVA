/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class UchihaClan extends Clan {

    public UchihaClan() {
        this.setLeader("Sasuke");
        this.setNameOfClan("UCHIHA");
    }

    @Override
    public void specialAbility() {
        System.out.println("Habilidade Especial: Sharingan ");
        this.lineDisplay();
    }
    
   

 
    
}
