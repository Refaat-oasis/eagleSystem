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
public class problem12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter(X1,Y1): ");
                double x1=input.nextDouble();
                double y1=input.nextDouble();
                System.out.println("Please enter (X2,Y2): ");
                double x2=input.nextDouble();
                double y2=input.nextDouble();
                double a= Math.pow(x2 - x1,2);
                double b= Math.pow(y2 - y1,2);
                double sum= Math.sqrt(a+b);
                System.out.println("The distance is : "+sum);

                

               

    }
    
}
