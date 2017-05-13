/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.doordonot.java;

import java.util.Scanner;

/**
 *
 * @author admin
 */

/*
Type in the following code, make it work!
What does it print out if you tell it to do it?
What if you tell it not to? (answer in a comment)

Comment out the do/while loop and write a while loop that checks the same 
condition, and executes the same loop code.

When you just have a while loop, what prints out when you tell it to do it?
When you tell it not to? (answer in a comment) 
*/
public class DoOrDoNot {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Should I do it? (y/n) ");
        boolean doIt;

        if (input.next().equals("y")) {
            doIt = true; // DO IT!
        } else {
            doIt = false; // DONT YOU DARE!
        }

        boolean iDidIt = false;

        do {
            iDidIt = true;
            break;
        } while (doIt);

        if (doIt && iDidIt) {
            System.out.println("I did it!");
        } else if (!doIt && iDidIt) {
            System.out.println("I know you said not to ... but I totally did anyways.");
        } else {
            System.out.println("Don't look at me, I didn't do anything!");
        }
    }
}

