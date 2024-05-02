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
public class problem7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        System.out.println("Enter a string");
        String s2 = "asd";
        System.out.println("The new string is:" + s1.replace(s2, ""));

    }
}
