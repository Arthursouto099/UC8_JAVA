/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraysinjava;

import java.util.ArrayList;

public class MyArrayList {
    
    public MyArrayList() {
        
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        
        numbers.add(1);
        
        for(Integer number: numbers) {
            System.out.println(number);
        }
    }
}
