public class زفت {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean client = true;
        boolean assisstant = true;
        boolean loop = true;
        String name_client, starting_time;
        char select_role;
        int select_workspace, phone_num, national_id;
        int select_room, select_info, select_exit;

        do {
            System.out.println("choose from these options by writing the first letter");
            System.out.println("Client " + " Assistant");
            System.out.println("to Exit press n");

            select_role = scan.nextLine().charAt(0);

            if (select_role == 'c' || select_role == 'C') {

                do {
                    System.out.println("choose options from this menu [From 1 To 5] : ");
                    System.out.println("1) choose workspace");
                    System.out.println("2) give your information ");
                    System.out.println("3) Choose the type of room ");
                    System.out.println("4) Respect the rules of the places");
                    System.out.println("5) Exit");
                    select_exit = scan.nextInt();

                    switch (select_exit) {
                        //case 1 for client for choose workspace & study halls
                        case 1:

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
                                break;
                            }
                            if (select_workspace < 1 || select_workspace > 11) {
                                System.out.println("Invalid Number");
                                break;
                            }
                            System.out.println("The workspace is choosen.");

                            break;

                        //case 2 client enter his information
                        case 2:
                            scan.nextLine();
                            System.out.println("Enter your name :");
                            name_client = scan.nextLine();
                            System.out.println("Enter your phone number : ");
                            phone_num = scan.nextInt();

                            System.out.println("Enter your national_ID : ");
                            national_id = scan.nextInt();
                            System.out.println("Enter the Starting time :  ");
                            scan.nextLine();
                            starting_time = scan.nextLine();
                            System.out.println("you entered your information successfully");

                            break;
                        //case 3 the client choose type of room 
                        case 3:
                            System.out.println("choose the type of room [From 1 To 3] :");
                            System.out.println("1.Sharing");
                            System.out.println("2.Individual");
                            System.out.println("3.Private");
                            select_room = scan.nextInt();
                            if (select_room < 1 || select_room > 3) {
                                System.out.println("Invalid Number");
                                break;
                            }
                            System.out.println("You choosed the type successfully");

                            break;
                        // case 4  rules of workplace & study halls for client
                        case 4:
                            System.out.println("Respect the rules of the places:");
                            System.out.println("1.Be silent");
                            System.out.println("2.No smoking");
                            System.out.println("3.keep the place clean");
                            System.out.println("Respect your self so other can respect you");

                            break;
                        // case 5 for exit from case 1 (client) 
                        case 5:
                            client = false;
                            break;
                        default:
                            System.out.println("You entered a wrong number");
                            break;
                    }

                } while (client);
                loop = true;
            

        }
        

    
 if (select_role == 'A' || select_role == 'a') {
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
                                break;
                            }
                            // case 2 assistant to take client national ID
                            case 2: {
                                System.out.println("The client national ID is taken successfully");
                                break;
                            }
                            // case 3 assistant to take client phone number
                            case 3: {
                                System.out.println("The client phone number taken successfully");
                                break;
                            }
                            // case 4 assistant to confirm the process
                            case 4: {
                                System.out.println("The confirmation is done");
                                break;
                            }
                            // case 5 to exit from case 2 (assistant) 
                            case 5: {
                            }
                            break;
                            default:
                                System.out.println("You entered a wrong number");
                                break;
                        }

                    } while (assisstant);

            }
 else {
     System.out.println("do you want to continue y/n");
     if (select_role == 'y' || select_role == 'Y' )
         loop =true;
     if (select_role == 'n' || select_role == 'N' ){
         loop =false;
     }
 }
 }while (loop);
}
}
