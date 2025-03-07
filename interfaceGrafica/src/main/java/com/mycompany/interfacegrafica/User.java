/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacegrafica;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class User {
    public String name;
    public String email;
    private String password;
    
    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword( String value) {
        this.password = value;
    }
    
}
