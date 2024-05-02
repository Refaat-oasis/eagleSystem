/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.problem1;

import java.util.Random;

/**
 *
 * @author Admin
 */
public class problem9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      String s1="Hello,World";
      Random r= new Random();
      int x=r.nextInt((s1.length()));
      char s= s1.charAt(x);
        System.out.println(s);
              
      
    }
    
}
