/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package com.sg.alltrivia.java;

import java.util.Scanner;

/**
 *
 * @author admin
 */

//  Ask the user for several pieces of trivia, but when you display them, mix up 
//  the answers.

//  Example:
//  1,024 Gigabytes is equal to one what? Terabyte
//  In our solar system which is the only planet that rotates clockwise? Venus
//  The largest volcano ever discovered in our solar system is located on which 
//  planet? Mars
//  What is the most abundant element in the earth's atmosphere? Nitrogen
//
//  Wow, 1,024 Gigabytes is a Mars!
//  I didn't know that the largest ever volcano was discovered on Terabyte!
//  That's amazing that Venus is the most abundant element in the atmosphere...
//  Nitrogen is the only planet that rotates clockwise, neat!

public class AllTrivia {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
    
        String byteSize, planet1, planet2, element1;
        
//        String byteSize = "Terabyte";
//        String planet1 = "Venus";
//        String planet2 = "Mars"; 
//        String element1 = "Nitrogen";
        
        System.out.print("1,024 Gigabytes is equal to one what? ");
        byteSize = inputReader.nextLine();
        System.out.print("In our solar system which is the only planet that rotates clockwise? ");
        planet1 = inputReader.nextLine();
        System.out.print("The largest volcano ever discovered in our solar system is located on which \n" +
        " planet? ");
        planet2 = inputReader.nextLine();
        System.out.print("What is the most abundant element in the earth's atmosphere? ");
        element1 = inputReader.nextLine();
        
        System.out.println();
        
        System.out.println("Wow! 1,024 Gigabytes is a " + planet2);
        System.out.println("I didn't know that the largest ever volcano was discoverd"
                + "on " + byteSize);
        System.out.println("That's amazing that " + planet1 + " is the most abundant"
                + "element in the atmosphere...");
        System.out.println(element1 + " is the only planet that rotates clockwise, neat!");
        
        
    }
}
