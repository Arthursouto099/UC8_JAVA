/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class HyuugaClan extends Clan {
    
    public HyuugaClan() {
        this.setLeader("Hiashi");
        this.setNameOfClan("Hyuuga");
    }

    @Override
    public void specialAbility() {
        System.out.println("Habilidade Especial: Byakugan");
        this.lineDisplay();
    }
    
}
