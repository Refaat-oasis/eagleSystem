/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.analysis2;

import java.util.Scanner;

/**
 *
 * @author Sandra
 */
public class Analysis2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String name;
        int num, num2, phone_num, national_id, starting_time, num3, num4,num5;
        do {
            System.out.println("choose from 1-3 : ");
            System.out.println("1.Client");
            System.out.println("2.Assistant");
            System.out.println("3.Exit");
            num = scan.nextInt();

            switch (num) {
                
            case 1: {
                do{
                    System.out.println("choose options from this menu [From A To E] : ");
                    System.out.println("1) choose workspace");
                    System.out.println("2) give your information ");
                    System.out.println("3) Choose the type of room ");
                    System.out.println("4) Respect the rules of the places");
                    System.out.println("5) Quit");
                    num5= scan.nextInt();
                    switch (num5) {
                        case 1: {
                            System.out.println("choose workspace : ");
                            System.out.println("1.Nook               2.Step");
                            System.out.println("3.Zone               4.Reachzone");
                            System.out.println("5.House              6.Houbsy");
                            System.out.println("7.Study halls in university(1,2,3,4)");
                            System.out.println("8.Kaizen             9.Brain-up");
                            System.out.println("10.Krypton           11.Silent");
                            num2 = scan.nextInt();
                            if (num2 == 7) {
                                System.out.println("the study hall is choosen");
                            }
                            System.out.println("The workspace is choosen.");
                        }
                        break;
                        case 2: {
                            System.out.println("Enter your name :");
                            name = scan.nextLine();
                            System.out.println("Enter your phone number : ");
                            phone_num = scan.nextInt();
                            System.out.println("Enter your national_ID : ");
                            national_id = scan.nextInt();
                            System.out.println("Enter the Starting time :  ");
                            starting_time = scan.nextInt();
                            System.out.println("you entered your information successfully");
                        }
                        break;
                        case 3: {
                            System.out.println("choose the type of room [From 1 To 3] :");
                            System.out.println("1.Sharing");
                            System.out.println("2.Individual");
                            System.out.println("3.Private");
                            num3 = scan.nextInt();
                            System.out.println("You choosed the type successfully");
                        }
                        break;
                        case 4: {
                            System.out.println("Respect the rules of the places:");
                            System.out.println("1.Be silent");
                            System.out.println("2.No smoking");
                            System.out.println("3.keep the place clean");
                            System.out.println("Respect your self so other can respect you");
                        }
                        break;
                        case 5:
                        break;
                        default:
                            System.out.println("You entered a wrong character");
                        break;
                    }

                }while(num!=5);
                break;
            }
                case 2: {
                    do{
                    System.out.println("Choose from [From 1-5]:");
                    System.out.println("1.Take the client name");
                    System.out.println("2.Take the client national ID");
                    System.out.println("3.Take the client phone number");
                    System.out.println("4.Confirm the client reservation");
                    System.out.println("5.Quit");
                    num4 = scan.nextInt();
                    switch(num4){
                        case 1 :{
                            System.out.println("The client name is taken successfully");
                        }
                        break;
                        case 2: {
                            System.out.println("The client national ID is taken successfully");
                        }
                        break;
                        case 3: {
                            System.out.println("The client phone number is taken successfully");
                        }
                        break;
                        case 4:{
                            System.out.println("The confirmation is done ");
                        }
                        break;
                        case 5:
                        break;
                    default:
                    System.out.println("You entered a wrong character");
                    break;
                    }
                    }while(num4!=5);
              }
                case 3 :
                break;
                default:
                    System.out.println("You entered a wrong number");
              }
            }while(num!=3);
        } 
    
}
