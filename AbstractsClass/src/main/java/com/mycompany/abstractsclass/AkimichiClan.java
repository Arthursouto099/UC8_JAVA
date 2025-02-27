/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class AkimichiClan  extends Clan{
    
    public AkimichiClan() {
        this.setLeader("Chouza");
        this.setNameOfClan("AkimichiClan");
    }

    @Override
    public void specialAbility() {
       System.out.println("Habilidade Especial: Ampliação Corporal");
       this.lineDisplay();
    }
}
