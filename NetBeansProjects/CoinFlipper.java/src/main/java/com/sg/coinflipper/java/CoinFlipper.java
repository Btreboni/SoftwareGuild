/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.coinflipper.java;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author admin
 */


//Write a program that simulates a random coin toss.
//Don't use .nextInt()

public class CoinFlipper {
    public static void main(String[] args) {
        Random randomizer = new Random();
        Scanner userInput = new Scanner (System.in);
        
        boolean coinSide = true; 
        
        System.out.println("Ready...");
        System.out.println("Set...");
        System.out.println("FlIP!!!  ");
        System.out.println();
        
            if (Math.random() < .5) {
                coinSide = true;
                System.out.println("You got HEADS!!");
            } 

            else {
                coinSide = false;
                System.out.println("You got TAILS!");
            }
            
            
        
        
        
        
        
        
    }
    
    
    
    
    
}


//What you should see example:
//
//Ready, Set, Flip....!!
//You got TAILS!