/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.paymentplataform;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class PaymentPlataform {

    public static void main(String[] args) {
        BankAccount conta1 = new BankAccount(new User("tavares", "142-666-666-88"), 5000, new CreditCard("88899393", 307));
        BankAccount conta2 = new BankAccount(new User("julio", "142-666-974-34"), 0, new CreditCard("56781929", 309));
        
        
        conta1.incrementBalance(5000);
        conta1.transferPayPal(5000, conta2);
        conta1.getLastTransferPaypal();
        conta2.transferCreditCard(600, conta1);
        conta2.getLastTransferCreditCard();

    
        
    
    }
    
        
}

