/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysinjava;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Array {

    
    public Array() {
  
        
        
    }
    
    public static void main(String[] args) {
       int[] numbers = {1,2,3};
       int newValue = 4;
       
       int[] newArray = new int[numbers.length + 1];
       
      for(int i = 0; i < numbers.length; i++) {
          newArray[i] = numbers[i];
      }
       
       newArray[numbers.length] = newValue;
       
       numbers = newArray;
       
       for(int number : numbers) {
           System.out.println(number);
       }
       
       
       
       
         
    }
    
    
    
}
