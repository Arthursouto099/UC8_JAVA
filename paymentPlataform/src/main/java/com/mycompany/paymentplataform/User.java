/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentplataform;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class User {
    String name;
    private String cpf;
    
    
    public User(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return this.cpf;
    }
}
