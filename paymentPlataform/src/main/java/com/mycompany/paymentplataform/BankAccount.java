/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentplataform;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class BankAccount {
    User owner;
    CreditCard creditCard;
    private double balance;
    
    
    public BankAccount(User user, int initialBalance, CreditCard creditCard) {
        this.owner = user;
        this.balance = initialBalance;
        this.creditCard = creditCard;
    } 
    
    public double getBalance() {
        return this.balance;
    }
    
    public void withdraw(double value) {
        
        if(value > this.balance) {
            System.out.println("Saldo insuficiente");
  
        }
        
        else {
            this.balance -= value;
            System.out.println("Saldo realizado com sucesso, valor atual: " + this.balance);
        }
    }
    
    public void depositCreditCard(BankAccount account ) {
        
    }
    
    
}
