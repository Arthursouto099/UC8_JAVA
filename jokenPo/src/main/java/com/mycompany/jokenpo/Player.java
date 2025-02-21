/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jokenpo;
import java.util.Scanner;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Player {
    private String name;
    private Scanner myScan = new Scanner(System.in);
    
    public Player() {
        System.out.println("Digite seu nome: ");
        this.name = this.myScan.nextLine();
    }
    
    public String getName() {
        return this.name;
    }
    
    
}
