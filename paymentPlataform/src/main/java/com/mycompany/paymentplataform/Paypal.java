/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentplataform;

/**
 *
 * @author Usuario
 */
public class Paypal implements Payment {
    private String email;
    private User owner;
    private BankAccount account;
    private double currentTransfer;
    
    public Paypal(String email) {
        this.email = email;
    }
    
    public void setOwner(User owner) {
        this.owner = owner;
    }
    
    public void setBankAccount(BankAccount account) {
        this.account = account;
    }

    @Override
    public void processPayment(double value, BankAccount account) {
        this.account.withdraw(value);
        this.currentTransfer = value;
        account.incrementBalance(value);
        System.out.println("Tranferencia realizado no valor de " + value);
        
    }

    @Override
    public void getDetails() {
         if(this.currentTransfer > 0) {
        System.out.println("Titular: " + this.owner.name);
        System.out.println("Email: " + this.email);
        System.out.println("Cpf do Titular: " + this.owner.getCpf());
        System.out.println("Transferencia utilizando paypal");
        System.out.println("Valor da transferencia: " + this.currentTransfer );
        System.out.println("--------------------------------------------------");
        }else {
            System.out.println("Você ainda não realizou nenhuma transferencia");
        }
    }
    
}
