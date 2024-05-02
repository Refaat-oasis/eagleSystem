import java.util.Scanner;

/**
 *
 * @author Sandra
 */
public class Analysis {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch;
        String name;
        int num, num2, phone_num, national_id, starting_time, num3, num4;
        do {
            System.out.println("choose from 1 and 2 : ");
            System.out.println("1.Client");
            System.out.println("2.Assistant");
            num = scan.nextInt();

            switch (num) {
                case 1: {
                    System.out.println("choose options from this menu [From A To D] : ");
                    System.out.println("a) choose workspace");
                    System.out.println("b) give your information ");
                    System.out.println("c) Choose the type of room ");
                    System.out.println("d) Respect the rules of the places");
                    ch = scan.next().charAt(0);
                    switch (ch) {
                        case 'a': {
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
                        case 'b': {
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
                        case 'c': {
                            System.out.println("choose the type of room [From 1 To 3] :");
                            System.out.println("1.Sharing");
                            System.out.println("2.Individual");
                            System.out.println("3.Private");
                            num3 = scan.nextInt();
                            System.out.println("You choosed the type successfully");
                        }
                        break;
                        case 'd': {
                            System.out.println("Respect the rules of the places:");
                            System.out.println("1.Be silent");
                            System.out.println("2.No smoking");
                            System.out.println("3.keep the place clean");
                            System.out.println("Respect your self so other can respect you");
                        }
                        break;
                        default:
                            System.out.println("You entered a wrong character");
                            break;
                    }

                }
                break;
                case 2: {
                    System.out.println("Choose from [From 1-4]:");
                    System.out.println("1.Take the client name");
                    System.out.println("2.Take the client national ID");
                    System.out.println("3.Take the client phone number");
                    System.out.println("4.Confirm the client reservation");
                    num4 = scan.nextInt();
                    System.out.println("You choosed the number successfully");

                }
                break;
                default:
                    System.out.println("You entered a wrong character");
                    break;

            }
        } while (true);