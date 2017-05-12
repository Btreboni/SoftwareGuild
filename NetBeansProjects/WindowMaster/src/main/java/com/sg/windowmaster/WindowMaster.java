/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.windowmaster;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class WindowMaster {
    public static void main(String[] args){
        // You must first declare the variables for 
        // both height and width. Use float instead
        // of double because it's a smaller byte size.
        // We will normaly use bigdecimal to calculate
        // money, not floats! We will do this later.
        float height;
        float width;
        
        // Second, we have to declare String Variables,
        // in order to hold the users HT & WT inputs.
        String stringHeight;
        String stringWidth;
        
        // Third, we have to calculate the total cost
        // of the window based on the area and perimiter.
        // Must declare other variables. 
        float areOfWindow;
        float cost;
        float permiterOfWindow;
        // These are the things that we need to keep
        // track of.
        
        // Introducing scanners. You must declare 
        // and initial the scanner. You do this to
        // get input from the user
        
        // After you type in the scanner below, you hit
        // command/shift/i and it will import/fix the 
        // scanner. 
        Scanner sc = new Scanner(System.in);
        
        // Now you have to actually ask the user for
        // the input.
        System.out.println("Please enter window height: ");
        stringHeight = sc.nextLine();
        System.out.println("Please enter the window width; ");
        stringWidth = sc.nextLine();
        
        // Now we must set the variables to a value. 
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        // Calculate the are of the window
        areOfWindow = height * width;
        
        // Calculate the perimiter of the window
        permiterOfWindow = 2 * (height + width);
        
        // Calculate total cost - use hard coded for material cost
        cost = ((3.50f * areOfWindow) + (2.25f * permiterOfWindow));
        
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areOfWindow);
        System.out.println("Window perimiter = " + permiterOfWindow);
        System.out.println("Total Cost = " + cost);
        
        
        
        
        
        
        
        
        
    }
}
