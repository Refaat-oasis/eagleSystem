 Scanner scan = new Scanner(System.in);
        // select for selecting from student or student affaits
        //grade for sellecting your grade 
        //grade1 for grade 1 sellection 
        //grade2 for grade 2 sellection 
        //grade3 for grade 3 sellection 
        //grade4 for grade 4 sellection 
        //student aff for student affairs sellectin
        int select, grade, grade1 , grade2_3_4 , studentaff;
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

        } while (select!=3);
    }
}
