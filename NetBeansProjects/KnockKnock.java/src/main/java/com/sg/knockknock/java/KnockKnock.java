/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.knockknock.java;

import java.util.Scanner;

/**
 *
 * @author admin
 */

//  Challange!
//  Type in the following code into a file that matches above. Make it work!
//  What happens if you change .equals() to a == ? (Explain in a comment!)
//  What happens if you don't type it in the right capitalization? How might you fix that?

public class KnockKnock {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        
        System.out.print("Knock Knock! Guess who!! ");
        String nameGuess = "Marty McFly";// = inputReader.nextLine();

        //When you change .equals to == the code doesn't work. 
        // If you don't have the right capitalization, it doesn't work.
        if(nameGuess.equals(MartyMcFly)){
            System.out.println("Hey! That's right! I'm back!");
            System.out.println(".... from the Future."); // Sorry, had to!
        }else{
            System.out.println("Dude, do I -look- like " + nameGuess);
        }
        
        
//  Knock Knock! Guess who!! Marty McFly
//  Hey! That's right! I'm back!
//  .... from the Future
    }
}
    
