/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Battery implements InstrumentMusical {
    
    private String brand = "Generic";
    
    @Override
    public void play() {
        System.out.println("A beteria  de marca " + this.brand + "está fazendo bleibbleib");
    }    

    @Override
    public void tune() {
          System.out.println("A bateria de marca " + this.brand + "está afinado");
    }
    
}
