/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.allaboutme.java;

/**
 *
 * @author admin
 */
public class AllAboutMe {
    public static void main(String[] args) {
//  1. Write a program that has five variables. These variables should not all be the same type.
//  2. These variables should have data that stores your name, your favorite food, 
//     how many pets you have, if you have ever eaten gnocchi, and the age when you learned to whistle.
//  3. Print each piece of data out on it's own line using your shiny new variables!
        Boolean eatGnocci = true;
        
        int numPets = 3;
        int age = 5;
        
        String name, favFood; 
        
        name = "Burke Treboni";
        favFood = "Chipotle";
        
        System.out.println("Hello! I am " + name + " ." );
        System.out.println("I have " + numPets + " pets.");
        System.out.println("My favorite food is " + favFood + " .");
        System.out.println("It is " + eatGnocci + " that I have eaten Gnocci.");
        System.out.println("And when I was " + age + " years old, I learned to whistle.");
        
        
        

        



    }
}
