/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptions.exercise_2;

/**
 *
 * @author ARTHURSANTOSTAVARESS
 */
public class Dog {
    private String name;
    private String breed;
    private int age;
    private int weight;
    
    
    public Dog(String name, String breed, int age, int weight) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
    
    public String ToString() {
        return " Name: " + this.name + ", Breed: " + this.breed + ", Age: " + this.age + ", weight: " + this.weight ;
    }
    
    
}
