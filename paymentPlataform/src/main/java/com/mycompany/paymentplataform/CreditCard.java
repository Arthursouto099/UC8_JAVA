/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paymentplataform;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class CreditCard implements Payment {
       String numberCard;
       int securityCode;
       private User owner; 
       private BankAccount account;
       double currentTransfer; 
       
       public CreditCard(String numberCard, int securityCode ) {
           this.numberCard = numberCard;
           this.securityCode = securityCode;
       } 
       
       public BankAccount getBankAccount() {
           return this.account;
       }
       
       public void setBankAccount(BankAccount account) {
           this.account = account;
       }
       
       public void setOwner(User owner) {
           this.owner = owner;
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
        System.out.println("Cpf do Titular: " + this.owner.getCpf());
        System.out.println("Final do cartão de credito: " + "XXXX" + this.numberCard.substring(this.numberCard.length() - 4));
        System.out.println("Valor da transferencia: " + this.currentTransfer );
        System.out.println("--------------------------------------------------");
        }else {
            System.out.println("Você ainda não realizou nenhuma transferencia");
        }
        
       
    }
}
       

