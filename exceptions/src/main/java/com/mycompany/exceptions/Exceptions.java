/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptions;
import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Exceptions {

    public static void main(String[] args) {

        
     
       try {
           FileReader file = new FileReader("arquivo.txt");
           
       }
       catch(IOException e) {
           System.out.println(e.getMessage());
       }
       
      
    }
    
    
    public static void scanAge(int age) {
        if(age < 18) {
            throw new IllegalArgumentException("Menor de idade palhaço");
        }
        System.out.println("JavaScript");
    }
}
