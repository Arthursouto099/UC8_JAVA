/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class KeyBoard implements InstrumentMusical {
    
    private String brand = "Generic";
    
    @Override
    public void play() {
        System.out.println("O Teclado de marca " + this.brand + "está fazendo bleibbleib");
    }    

    @Override
    public void tune() {
          System.out.println("O Teclado de marca " + this.brand + "está afinado");
    }
}
