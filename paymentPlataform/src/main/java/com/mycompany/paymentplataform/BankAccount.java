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
    private CreditCard creditCard;
    private Paypal paypal;
    String email;
    private double balance;
    
    
    
    public BankAccount(User user, double initialBalance, CreditCard creditCard) {
        this.owner = user;
        this.balance = initialBalance;
        this.creditCard = creditCard;
        this.creditCard.setBankAccount(this);
        this.creditCard.setOwner(this.owner);
        this.paypal = new Paypal(this.email);
        this.paypal.setBankAccount(this);
        this.paypal.setOwner(this.owner);
        
    } 
    
    public double getBalance() {
        return this.balance;
    }
    
    public void incrementBalance(double value) {
        this.balance += value;
    }
    

    public void withdraw(double value) {
        
        if(value > this.balance) {
            System.out.println("Saldo insuficiente");
  
        }
        
        else {
            this.balance -= value;
            System.out.println("Saque realizado com sucesso, valor atual: " + this.balance);
        }
    }
    
    public void  transferCreditCard( double value, BankAccount account ) {
        if(value > this.balance) {
            System.out.println("Saldo insuficiente ");
            return;
        }
        
        this.creditCard.processPayment(value, account);
        
    }
    
    public void transferPayPal(double value, BankAccount account) {
        if(value > this.balance) {
            System.out.println("Saldo insuficiente");
            return;
        }
        
        this.paypal.processPayment(value, account);
        
        
    }
    
    public void getLastTransferCreditCard() {
        this.creditCard.getDetails();
    }
    
    public void getLastTransferPaypal() {
        this.paypal.getDetails();
    }
    
    
}
