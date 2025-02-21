/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Guitar implements InstrumentMusical {
    
    private String brand = "Tagma";

    @Override
    public void play() {
        System.out.println("O violão de marca " + this.brand + "está fazendo bleibbleib");
    }    

    @Override
    public void tune() {
          System.out.println("O violão de marca " + this.brand + "está afinado");
    }
    
    public void changeRope() {
            System.out.println("O violão de marca " + this.brand + "teve as cordas trocadas");
    }
    
}
