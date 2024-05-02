  Scanner scan = new Scanner(System.in);
        // selectmenu for selecting from student or student affaits
        //grade for sellecting your grade 
        //grade1 for grade 1 sellection 
        //grade2_3_4 for grade 2 , grade 3, grade 4  sellection 
        String selectmenu, grade, grade1, grade2_3_4, studentaff;
        do 
        {
            System.out.println("Choose from the following : ");
            System.out.println("1- Student : ");
            System.out.println("2- Student affairs : ");
            System.out.println("3- Quit : ");
            selectmenu = scan.nextLine();
            //try catch for handling exeption if user enter String 
            try 
            {
                Integer.parseInt(selectmenu);
                switch (selectmenu)
                {
                    //case 1 for student
                    case "1":
                        do
                        {
                            System.out.println("Choose from the following : ");
                            System.out.println("1- Grade 1 : ");
                            System.out.println("2- Grade 2 : ");
                            System.out.println("3- Grade 3 : ");
                            System.out.println("4- Grade 4 : ");
                            System.out.println("5- Quit : ");
                            grade = scan.nextLine();
                            //try catch for handling exeption if user enter String 
                            try
                            {
                                Integer.parseInt(grade);

                                switch (grade) 
                                {
                                    //case 1 for grade 1
                                    case "1":
                                        do
                                        {
                                            System.out.println("Choose from the following : ");
                                            System.out.println("1-Enter your name and data required : ");
                                            System.out.println("2-Select courses : ");
                                            System.out.println("3-Enter your credit card kind : ");
                                            System.out.println("4-Enter your credit card data : ");
                                            System.out.println("5-Enter code confirmation : ");
                                            System.out.println("6-Quit : ");
                                            grade1 = scan.nextLine();
                                            //try catch for handling exeption if user enter String 
                                            try 
                                            {
                                                Integer.parseInt(grade1);

                                                switch (grade1)
                                                {
                                                    case "1":
                                                        //get Student data and data from user
                                                        String Student_data = scan.nextLine();
                                                        System.out.println("Your entered Student_data Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "2":
                                                        //get courses from user
                                                        String courses = scan.nextLine();
                                                        System.out.println("You selected the courses sucessfuly ");
                                                        System.out.println("");
                                                        break;
                                                    case "3":
                                                        //get credit card kind from user
                                                        String creditcard_kind = scan.nextLine();
                                                        System.out.println("You entered creditcard_kind Sucessfuly");
                                                        break;
                                                    case "4":
                                                        //get credit card data from user
                                                        String creditcard_data = scan.nextLine();
                                                        System.out.println("You entered creditcard_data Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "5":
                                                        //get confirmation code from user
                                                        String code = scan.nextLine();
                                                        System.out.println("The whole data is confirmed Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "6":
                                                        //The user wants to exist
                                                        break;
                                                    default:
                                                        //default for handling exeption if user enter invalid integer 
                                                        System.out.println(grade1 + " is invalid number , please enter an4other number");
                                                        System.out.println("");
                                                        break;

                                                }
                                            } catch (NumberFormatException e)
                                            {
                                                System.out.println(grade1 + " is wrong choice , please enter another number");
                                                System.out.println("");
                                            }
                                        } while (!grade1.equals("6"));
                                        break;
                                    ///case 2 for grade 2
                                    ///case 3 for grade 3 
                                    ///case 4 for grade 4 
                                    case "2":
                                    case "3":
                                    case "4":
                                        do 
                                        {
                                            System.out.println("Choose from the following : ");
                                            System.out.println("1-Enter your name : ");
                                            System.out.println("2-Enter your GPA : ");
                                            System.out.println("3-Select cources : ");
                                            System.out.println("4-Enter your credit card kind : ");
                                            System.out.println("5-Enter your credit card data : ");
                                            System.out.println("6-Enter code confirmation : ");
                                            System.out.println("7-Quit : ");
                                            grade2_3_4 = scan.nextLine();
                                            //try catch for handling exeption if user enter String 
                                            try 
                                            {
                                                Integer.parseInt(grade2_3_4);
                                                switch (grade2_3_4)
                                                {
                                                    case "1":
                                                        //get Student name from user
                                                        String Student_name = scan.nextLine();
                                                        System.out.println("Your name Entered Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "2":
                                                        //get GPA student from user
                                                        String GPA = scan.nextLine();
                                                        System.out.println("Your GPA is " + GPA);
                                                        System.out.println("");
                                                        break;
                                                    case "3":
                                                        //get courses from user
                                                        String courses = scan.nextLine();
                                                        System.out.println("You selected courses Successfully ");
                                                        System.out.println("");
                                                        break;
                                                    case "4":
                                                        //get credit card kind from user
                                                        String creditcard_kind = scan.nextLine();
                                                        System.out.println("You entered creditcard_kind Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "5":
                                                        //get credit card data from user
                                                        String creditcard_data = scan.nextLine();
                                                        System.out.println("You entered creditcard_data Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "6":
                                                        //get code from user
                                                        String code = scan.nextLine();
                                                        System.out.println("The whole data is confirmed Sucessfuly");
                                                        System.out.println("");
                                                        break;
                                                    case "7":
                                                        //the user wants to exist
                                                        break;
                                                    default:
                                                        //default for handling exeption if user enter invalid integer
                                                        System.out.println(grade2_3_4 + " is invalid number , please enter another number");
                                                        System.out.println("");
                                                        break;
                                                }
                                            } catch (NumberFormatException e) {
                                                System.out.println(grade2_3_4 + " is wrong choice , please enter another number");
                                                System.out.println("");
                                            }
                                        } while (!grade2_3_4.equals("7"));
                                        break;

                                    case "5":
                                        //the user wants to exist
                                        break;
                                    default:
                                        //default for handling exeption if user enter invalid integer
                                        System.out.println(grade + " is invalid number , please enter another number");
                                        System.out.println("");
                                }
                            } catch (NumberFormatException e)
                            {
                                System.out.println(grade + " is Wrong choice , please enter another number");
                                System.out.println("");
                            }
                        } while (!grade.equals("5"));

                        break;
////case 2 for Student affairs 
                    case "2":
                        do 
                        {
                            System.out.println("Choose frome the following :");
                            System.out.println("1-Check students data : ");
                            System.out.println("2-Add new course : ");
                            System.out.println("3-Edit course : ");
                            System.out.println("4-Delete course : ");
                            System.out.println("5-Quit : ");
                            //the students affairs sellection
                            studentaff = scan.nextLine();
                            //try catch for handling exeption if user enter String 
                            try
                            {
                                Integer.parseInt(studentaff);

                                switch (studentaff) {
                                    case "1":
                                        //get Students data from user to check
                                        String check_Studentsdata = scan.nextLine();
                                        System.out.println("The process is done");
                                        System.out.println("");
                                        break;
                                    case "2":
                                        //get new course from user
                                        String Add_new_courses = scan.nextLine();
                                        System.out.println("You added courses successfully");
                                        System.out.println("");
                                        break;
                                    case "3":
                                        //get courses from user to be edited
                                        String Edit_courses = scan.nextLine();
                                        System.out.println("You edited courses Sucessfully");
                                        System.out.println("");
                                        break;
                                    case "4":
                                        //get courses from user to be deleted
                                        String Delete_courses = scan.nextLine();
                                        System.out.println("You deleted courses successfully");
                                        System.out.println("");
                                        break;
                                    case "5":
                                        //the user wants to exit
                                        break;
                                    default:
                                        System.out.println(studentaff + " is invalid number , please enter another number");
                                        System.out.println("");
                                }
                            } catch (NumberFormatException e) {
                                System.out.println(studentaff + " is wrong choice , please enter another number");
                                System.out.println("");
                            }
                        } while (!studentaff.equals("5"));
                        break;

                    case "3":
                        //The user wants to exist
                        break;
                    default:
                        //default for handling exeption if user enter invalid integer
                        System.out.println(selectmenu + " is invalid number , please enter another number");
                        System.out.println("");

                }
            } catch (NumberFormatException e) 
            {
                System.out.println(selectmenu + " is wrong choice , please enter another number");
                System.out.println("");
            }

        } while (!selectmenu.equals("3"));