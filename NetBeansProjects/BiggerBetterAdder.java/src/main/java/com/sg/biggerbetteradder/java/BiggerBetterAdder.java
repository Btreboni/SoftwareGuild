/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.biggerbetteradder.java;

import java.util.Scanner;

/**
 *
 * @author admin
 */

// Create a program that uses taken user input in a conversation. First ask the 
// user for their name. Then display that name, and tell them yours 
// (or your AI's name!) Ask them for their favorite color. Then display that, but 
// in a conversational way. Do the same thing with favorite food and number, and 
// then say goodbye!
//
// Make sure you use the right variable with the right user input!


public class BiggerBetterAdder {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        String yourName;
        String myName;
        String yourFavColor;
        String yourFavFood;
        String lastResponse;

        double yourFavNumber;
        
        myName = "Burke";
        
        System.out.println("Hello there! ");
        
        System.out.print("What is your name? ");
        yourName = inputReader.nextLine();
        
        System.out.println("Hi! " + yourName + "! My name is Burke. ");
       
        
        System.out.println("What is your favorite color?");
        yourFavColor = inputReader.nextLine();
        
        System.out.println(yourFavColor + " , that's cool.");
        
        System.out.println("How about food. Where do you like to eat? ");
        yourFavFood = inputReader.nextLine();
        
        System.out.println(yourFavFood + " , I love that place!");
        
        System.out.println("Speaking of favorites, what is your favorite number?");
        yourFavNumber = inputReader.nextDouble();
        
        System.out.println("No kidding! " + yourFavNumber + " is my favorite"
                + " number too!");
        System.out.println("Well, sorry but I need to take off. I have to go "
                + "finish my coding homework or Pat is going to be pissed! "
                + "I'll see you tomorrow!");
        
        
        
        
        
        
    }
}
