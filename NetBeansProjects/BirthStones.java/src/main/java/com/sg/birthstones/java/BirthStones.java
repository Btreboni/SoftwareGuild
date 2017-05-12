/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.birthstones.java;

import java.util.Scanner;

/**
 *
 * @author admin
 */

//  Challange!
//  Write a program that asks for a number, match that number against the month 
//  number and printout the name of the month and it’s corresponding birth stone.
//  Use Ifs and Elses to complete it.

public class BirthStones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String userNumString;
        int userNum;
        
        System.out.print("What months birthstone are you wanting to know? ");
        userNum = scan.nextInt();
        System.out.println();
        
        if (userNum == 1) {
            System.out.println("January's birthstone is Garnet");
        } else if (userNum == 2) {
            System.out.println("February's birthstone is Amethyst");
        } else if (userNum == 3) {
            System.out.println("March's birthstone is Aquamarine");
        } else if (userNum == 4) {
            System.out.println("April's birthstone is Diamond");
        } else if (userNum == 5) {
            System.out.println("May's birthstone is Emerald");
        } else if (userNum == 6) {
            System.out.println("June's birthstone is Pear");
        } else if (userNum == 7) {
            System.out.println("July's birthstone is Ruby");
        } else if (userNum == 8) {
            System.out.println("August's birthstone is Peridot");
        } else if (userNum == 9) {
            System.out.println("September's birthstone is Sapphire");
        } else if (userNum == 10) {
            System.out.println("October's birthstone is Opal");
        } else if (userNum == 11) {
            System.out.println("November's birthstone is Topaz");
        } else if (userNum == 12) {
            System.out.println("December's birthstone is Turqoise");
        } else if (userNum < 1) {
            System.out.println("I think you must be confused, " + userNum 
                    + " doesn't match a month" );
        }
        
        
        
    }
}
