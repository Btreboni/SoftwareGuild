/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.opinionator.java;

import java.util.Random;

/**
 *
 * @author admin
 */

//Challange!
//
//Type in the following code, make it work!
//There is a bug in our code though, find it and fix it! (Explain in a comment!)

public class Opinionator {
    public static void main(String[] args) {
        Random randomizer = new Random();
        
        System.out.println("I can't decide what animal I like the best.");
        System.out.println("I know! Random can decide FOR ME!");

        int x = randomizer.nextInt(6);
        
        /*
        The bug was directly above ^^ there, inside the .nextInt. It was set to
        5, therefore it would not randomize to #5. By changing it to 6, the 
        computer allows us to randomize else if for # 5. 
        
        */

        System.out.println("The number we chose was: " + x);

        if (x == 0) {
            System.out.println("Llamas are the best!");
        } else if (x == 1) {
            System.out.println("Dodos are the best!");
        } else if (x == 2) {
            System.out.println("Woolly Mammoths are DEFINITELY the best!");
        } else if (x == 3) {
            System.out.println("Sharks are the greatest, they have their own week!");
        } else if (x == 4) {
            System.out.println("Cockatoos are just so awesomme!");
        } else if (x == 5) {
            System.out.println("Have you ever met a Mole-Rat? They're GREAT!");
        }

        System.out.println("Thanks Random, maybe YOU'RE the best!");
    }
}

//Should expect
//I can't decide what animal I like the best.
//I know! Random can decide FOR ME!
//The number we chose was: 3
//Sharks are the greatest, they have their own week!
//Thanks Random, maybe YOU'RE the best!