/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problem1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class problem14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 999: ");
        int number = input.nextInt();
        //int lessThan10 = number % 10;
        int hundreds = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int lessThan10 = number % 10;
        // int hundreds = number % 10;
        number /= 10;
        int sum = hundreds + tens + lessThan10;
        System.out.println("The sum of the digits is " + sum);
    }

}
