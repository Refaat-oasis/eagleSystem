/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.finaltask;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class Finaltask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner read = new Scanner(System.in);

        boolean module = true;
        while (module) {

            System.out.println("welcome to wap system");
            System.out.println("please choose the number of the function you want");
            System.out.println("1- register and payment     2- attendance      3- workspace");
            System.out.println("if you want to exit please press 4");
            int modulechoose = scan.nextInt();

            switch (modulechoose) {
                case 1:
                    System.out.println("welcome to registration and payment");
// registration and payment module

                    // select for selecting from student or student affaits
                    //grade for sellecting your grade 
                    //grade1 for grade 1 sellection 
                    //grade2_3_4 for grade 2 , grade 3, grade 4  sellection 
                    int select,
                     grade,
                     grade1,
                     grade2_3_4,
                     studentaff;
                    do {
                        System.out.println("choose from the following : ");
                        System.out.println("1- Student ");
                        System.out.println("2- Student affairs ");
                        System.out.println("3- Quit ");
                        select = scan.nextInt();

                        switch (select) {
                            //case 1 for student
                            case 1:
                                do {
                                    System.out.println("choose from the following : ");
                                    System.out.println("1- Grade 1 ");
                                    System.out.println("2- Grade 2 ");
                                    System.out.println("3- Grade 3 ");
                                    System.out.println("4- Grade 4 ");
                                    System.out.println("5-Quit");
                                    grade = scan.nextInt();
                                    switch (grade) {
                                        //case 1 for grade 1
                                        case 1:
                                            do {
                                                System.out.println("choose from the following : ");
                                                System.out.println("1-Enter your name and data required: ");
                                                System.out.println("2-Select courses : ");
                                                System.out.println("3-Enter your credit card kind : ");
                                                System.out.println("4-Enter your credit card data : ");
                                                System.out.println("5-Enter code confirmation: ");
                                                System.out.println("6-quit ");
                                                grade1 = scan.nextInt();
                                                switch (grade1) {
                                                    case 1:
                                                        System.out.println("your data Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 2:
                                                        System.out.println("you selected the course sucessfuly ");
                                                        System.out.println("");
                                                        break;
                                                    case 3:
                                                        System.out.println("you Entered Sucessfuly");
                                                        break;
                                                    case 4:
                                                        System.out.println("you Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 5:
                                                        System.out.println("The whole data is confirmed Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 6:
                                                        break;
                                                    default:
                                                        System.out.println("Invalid please Enter the right number ");
                                                        System.out.println("");
                                                        break;

                                                }
                                            } while (grade1 != 6);
                                            break;
                                        ///case 2 for grade 2
                                        ///case 3 for grade 3 
                                        ///case 4 for grade 4 
                                        case 2:
                                        case 3:
                                        case 4:
                                            do {
                                                System.out.println("choose from the following : ");
                                                System.out.println("1-Enter your name : ");
                                                System.out.println("2-Show my GPA : ");
                                                System.out.println("3-Select cources : ");
                                                System.out.println("4-Enter your credit card kind : ");
                                                System.out.println("5-Enter your credit card data : ");
                                                System.out.println("6-Enter code confirmation: ");
                                                System.out.println("7-quit ");
                                                grade2_3_4 = scan.nextInt();
                                                switch (grade2_3_4) {
                                                    case 1:
                                                        System.out.println("your name Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 2:
                                                        System.out.println("Your GPA is 3.89 ");
                                                        System.out.println("");
                                                        break;
                                                    case 3:
                                                        System.out.println("You selected Successfully ");
                                                        System.out.println("");
                                                        break;
                                                    case 4:
                                                        System.out.println("you Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 5:
                                                        System.out.println("you Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 6:
                                                        System.out.println("The whole data is confirmed Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case 7:
                                                        break;
                                                    default:
                                                        System.out.println("Invalid please Enter the right number ");
                                                        System.out.println("");
                                                        break;

                                                }
                                            } while (grade2_3_4 != 7);
                                            break;

                                        case 5:
                                            break;
                                        default:
                                            System.out.println("Invalid please enter the right grade ");
                                            System.out.println("");
                                    }
                                } while (grade != 5);

                                break;
////case 2 for Student affairs 
                            case 2:
                                do {
                                    System.out.println("Choose frome the following :");
                                    System.out.println("1-check Students data ");
                                    System.out.println("2-Add new course ");
                                    System.out.println("3-Edit course ");
                                    System.out.println("4- Delete course  ");
                                    System.out.println("5-Quit");
                                    //the students affairs sellection
                                    studentaff = scan.nextInt();
                                    switch (studentaff) {
                                        case 1:
                                            System.out.println("the process done");
                                            System.out.println("");
                                            break;
                                        case 2:
                                            System.out.println("You added cource successfully");
                                            System.out.println("");
                                            break;
                                        case 3:
                                            System.out.println("you Edited Sucessfully");
                                            System.out.println("");
                                            break;
                                        case 4:
                                            System.out.println("You deleted successfully");
                                            System.out.println("");
                                            break;
                                        case 5:
                                            break;
                                        default:
                                            System.out.println("Invalid enter the right choice ");
                                            System.out.println("");
                                    }
                                } while (studentaff != 5);
                                break;

                            case 3:
                                break;
                            default:
                                System.out.println("Wrong choice !");
                                System.out.println("");

                        }

                    } while (select != 3);

                    module = true;
                    break;
 // end of the module                   
                case 2:
                    System.out.println("welcome to attendance");
// attendance module


// student loop
                    boolean key = true;
// professor loop
                    boolean key1 = true;
// for the big outer loop
                    boolean key2 = true;

                    do {

                        System.out.println("please choose your role : Student / Professor ");
                        System.out.println("if you wist to exit just enter n ");
                        char job = read.next().charAt(0);

                        if (job == 'S' || job == 's') {
// stay in the student small loop and check that big one is also still looping
                            key2 = false;
                            System.out.println("please Enter your ID");
                            String student_ID = read.next();

                            System.out.println("please enter your password");
                            String Student_password = read.nextLine();
                            String Student_password1 = read.nextLine();

                            do {

                                System.out.println("please choose number of the function do you want");
                                System.out.println(" 1-register today course          2-show my attendance report    ");
                                System.out.println(" 3-do you have a complain?        4- Exit  ");
                                int Student_coice = read.nextInt();

                                switch (Student_coice) {
// in each case the key is still true to worl in the small loop until he chose exit so it break the do-while loop
                                    case 1:
                                        System.out.println("register today course");
                                        System.out.println("enter the code");
// code generated by professor
                                        String code = read.next();
                                        System.out.println("registered sussessful");

                                        key = true;
                                        break;
                                    case 2:
                                        System.out.println("show my attendance report");
                                        System.out.println("this is the report");
                                        key = true;
                                        break;
                                    case 3:
                                        System.out.println("do you have a complain?");
                                        read.nextLine();
                                        String complain = read.nextLine();
                                        System.out.println("complain has been saved sussefully");
                                        key = true;
                                        break;
                                    case 4:
                                        System.out.println("Exit");
                                        key = false;
                                        break;
                                    default:
                                        System.out.println("wrong choice ,please try again");

                                }

                            } while (key);

                        } else if (job == 'P' || job == 'p') {
// stay in the professor small loop and check that big one is also still looping
                            key2 = false;
                            System.out.println("please Enter your ID");
                            String professor_ID = read.next();
                            System.out.println("please enter your password");
                            String professor_password = read.nextLine();
                            String professor_password1 = read.nextLine();

                            do {
                                System.out.println("please choose number of the function do you want");
                                System.out.println("  1-register today course        2-postpone the course  ");
                                System.out.println("3- Edit attendance report    4-cancel today course     5- Exit");

                                int function = read.nextInt();
                                switch (function) {
                                    case 1:
                                        System.out.println("register today course");
// the module generate codes
                                        Random code = new Random();
                                        int x = Math.abs(code.nextInt());
                                        System.out.println("the code is :  " + x);
                                        key1 = true;
                                        break;
                                    case 2:
                                        System.out.println("postpone the course");
                                        System.out.println("enter the alternative date");
                                        String date = read.next();
                                        key1 = true;
                                        break;
                                    case 3:
                                        System.out.println("Edit attendance report");
                                        System.out.println("enter the student name ");
// enter name of the student which have problem in his or her attendance
                                        read.nextLine();
                                        String Student = read.nextLine();
                                        key1 = true;
                                        break;
                                    case 4:
                                        System.out.println("cancel today course");
                                        System.out.println("this lecture is canceled");
                                        key1 = true;
                                        break;
                                    case 5:
                                        System.out.println("Exit");
                                        key1 = false;
                                        break;
                                    default:
                                        System.out.println("wrong choice ,please try again");

                                }
                            } while (key1);

                        } else if (job == 'n' || job == 'N') {
                            break;
                        } else {
                            System.out.println("invalid choice");
                            System.out.println("do you wish to continue  y/n ");
// cont stant for continue or stop
                            char cont = read.next().charAt(0);
                            if (cont == 'y' || cont == 'Y') {
                                key2 = true;
                            }
                            if (cont == 'n' || cont == 'N') {
                                key2 = false;
                            }

                        }
                        key2 = true;
                    } while (key2);

                    module = true;
                    break;
// end of module                    
                case 3:
                    System.out.println("welcome to workspace");
// workspace module
                    

                    String name_client;
                    int selects,
                     select_workspace,
                     phone_num,
                     national_id,
                     starting_time,
                     select_room,
                     select_info,
                     select_exit;
                    do {
                        System.out.println("choose from 1 and 2 : ");
                        System.out.println("1.Client");
                        System.out.println("2.Assistant");
                        System.out.println("3.Exit");
                        selects = scan.nextInt();

                        switch (selects) {
                            //case 1 menu for client 
                            case 1: {
                                do {
                                    System.out.println("choose options from this menu [From A To E] : ");
                                    System.out.println("1) choose workspace");
                                    System.out.println("2) give your information ");
                                    System.out.println("3) Choose the type of room ");
                                    System.out.println("4) Respect the rules of the places");
                                    System.out.println("5) Exit");
                                    select_exit = scan.nextInt();
                                    switch (select_exit) {
                                        //case 1 for client for choose workspace & study halls
                                        case 1: {

                                            System.out.println("choose workspace : ");
                                            System.out.println("1.Nook               2.Step");
                                            System.out.println("3.Zone               4.Reachzone");
                                            System.out.println("5.House              6.Houbsy");
                                            System.out.println("7.Study halls in university(1,2,3,4)");
                                            System.out.println("8.Kaizen             9.Brain-up");
                                            System.out.println("10.Krypton           11.Silent");
                                            select_workspace = scan.nextInt();
                                            if (select_workspace == 7) {
                                                System.out.println("the study hall is choosen");
                                            }
                                            System.out.println("The workspace is choosen.");
                                            break;

                                        }
                                        //case 2 client enter his information
                                        case 2: {
                                            System.out.println("Enter your name :");
                                            name_client = scan.nextLine();
                                            System.out.println("Enter your phone number : ");
                                            phone_num = scan.nextInt();
                                            System.out.println("Enter your national_ID : ");
                                            national_id = scan.nextInt();
                                            System.out.println("Enter the Starting time :  ");
                                            starting_time = scan.nextInt();
                                            System.out.println("you entered your information successfully");
                                        }
                                        break;
                                        //case 3 the client choose type of room 
                                        case 3: {
                                            System.out.println("choose the type of room [From 1 To 3] :");
                                            System.out.println("1.Sharing");
                                            System.out.println("2.Individual");
                                            System.out.println("3.Private");
                                            select_room = scan.nextInt();
                                            System.out.println("You choosed the type successfully");
                                        }
                                        break;
                                        // case 4  rules of workplace & study halls for client
                                        case 4: {
                                            System.out.println("Respect the rules of the places:");
                                            System.out.println("1.Be silent");
                                            System.out.println("2.No smoking");
                                            System.out.println("3.keep the place clean");
                                            System.out.println("Respect your self so other can respect you");
                                        }
                                        break;
                                        // case 5 for exit from case 1 (client) 
                                        case 5:
                                            break;
                                        default:
                                            System.out.println("You entered a wrong number");
                                            break;
                                    }

                                } while (select_exit != 5);
                                break;
                            }
                            // case 2 for Assistant to take information from client 
                            case 2: {
                                do {
                                    System.out.println("Choose from [From 1-5]:");
                                    System.out.println("1.Take the client name");
                                    System.out.println("2.Take the client national ID");
                                    System.out.println("3.Take the client phone number");
                                    System.out.println("4.Confirm the client reservation");
                                    System.out.println("5.Exit");
                                    select_info = scan.nextInt();
                                    switch (select_info) {
                                        // case 1 assistant to take client name
                                        case 1: {
                                            System.out.println("The client name is taken successfully");
                                        }
                                        // case 2 assistant to take client national ID
                                        case 2: {
                                            System.out.println("The client national ID is taken successfully");

                                        }
                                        // case 3 assistant to take client phone number
                                        case 3: {
                                            System.out.println("The client phone number taken successfully");

                                        }
                                        // case 4 assistant to confirm the process
                                        case 4: {
                                            System.out.println("The confirmation is done");

                                        }
                                        // case 5 to exit from case 2 (assistant) 
                                        case 5: {
                                        }
                                        break;
                                        default:
                                            System.out.println("You entered a wrong number");
                                            break;
                                    }

                                } while (select_info != 5);

                            }
                            // case 3 to exit from the system
                            case 3:
                                break;
                            default:
                                System.out.println("You entered a wrong number");
                        }

                    } while (selects != 3);

                    module = true;
                    break;
                default:
                    if (modulechoose == 4){
                        module = false;
                        break;
                    }
                    System.out.println("invalid choice please select number from 1 2 3 ");

                    module = true;
                    break;
                    

            }
        }

    }
}
