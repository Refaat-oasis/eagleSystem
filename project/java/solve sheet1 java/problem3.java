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
public class problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*String s=("java exercise");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter");
        String x =input.next();
        boolean y=s.contains(x);
        System.out.println(y);*/
        
        
        
                String z="java exercise";
                        Scanner scan = new Scanner(System.in);
                                System.out.println("Enter a char");
                        char ch=scan.next().charAt(0);
                                System.out.println("true for found, false for not found");
                                boolean found =z.contains(ch+"");
                                if(found)
                                     System.out.println(" found");
                                else
                                     System.out.println("not found");
                                System.out.println();

                        


        
        
        
    }
    
}
