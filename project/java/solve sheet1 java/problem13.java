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
public class problem13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double year, minute, day, months;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of minutes: ");
        minute = input.nextDouble();
        year = minute / 525600;//365d*24h*60m

       months = minute / 43200;//24h*30d=720
       
        day = minute / 1440;//24h*60m

        System.out.println("There are " + year + "years, " + day + "days " + months + "months");

    }

}
