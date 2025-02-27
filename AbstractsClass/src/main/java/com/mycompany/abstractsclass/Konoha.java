/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstractsclass;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Konoha {

    public static void main(String[] args) {
       UchihaClan uchiha = new UchihaClan();
       HyuugaClan hyuuga = new HyuugaClan();
       NaraClan nara = new NaraClan();
       AkimichiClan akimichi = new AkimichiClan();
       
       uchiha.getDetails();
       uchiha.specialAbility();
       hyuuga.getDetails();
       hyuuga.specialAbility();
       nara.getDetails();
       nara.specialAbility();
       akimichi.getDetails();
       akimichi.specialAbility();
       
       
    }
}
