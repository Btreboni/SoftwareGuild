
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */

//  Your program must have the following features:
//
//  This program must be a Java Console Application called Factorizor.
//  This program must ask the user the number for which he/she wants to factor.
//  The program must print out the original number.
//  The program must print out the total number of factors for the number.
//  The program must print out each factor of the number (not including the 
//  number itself).
//  The program must print out whether or not the number is perfect.
//  The program must print out whether or not the number is prime.

public class Factorizor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String userNumString = "";
        int sum = 0, userNum = 0, numFactors = 0;
        
        System.out.print("What number would you like to factor? ");
        userNumString = scan.nextLine();
        userNum = Integer.parseInt(userNumString);
        
        for(int i = 1; i < userNum; i++){
            if (userNum % i == 0){
                System.out.println(i);
                sum += i;
                numFactors++;
            }
        }
        if (sum == userNum) {
            System.out.println("This number is perfect");
        } else {
            System.out.println("This number is not perfect");
        }
        
        if (numFactors < 2) {
            System.out.println("This Number is Prime");
        } else {
            System.out.println("This Number is not Prime");
        }
        
        
        
        
    }
}
