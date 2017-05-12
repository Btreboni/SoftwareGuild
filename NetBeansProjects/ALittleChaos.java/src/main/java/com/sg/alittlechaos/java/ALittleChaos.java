/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.alittlechaos.java;

import java.util.Random;

/**
 *
 * @author admin
 */

//Challange!
//Type in the below - make it work!
//Then play around with things.
//What happens if you change r.nextInt(101) to r.nextInt(50) + 50 ? 
//(answer in comment)

public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomizer = new Random();
        
        System.out.println("Random can make integers: " + randomizer.nextInt());
        System.out.println("Or a double: " + randomizer.nextDouble());
        System.out.println("Or even a boolean: " + randomizer.nextBoolean());

        int num = randomizer.nextInt(100);

        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        // changed all below from System.out.print(randomizer.nextInt(101) + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.print(randomizer.nextInt(50) + 50 + ", ");
        System.out.println(randomizer.nextInt(50) + 50);
        // By changeing it to 50, it now only prints between 50-100.
        
    }
}

//Random can make integers: -1990223926
//Or a double: 0.19256054969742875
//Or even a boolean: false
//You can store a randomized result: 66
//And use it over and over again: 66, 66
//Or just keep generating new values
//Here's a bunch of numbers from 0 - 100:
//66, 64, 49, 43, 8, 36
