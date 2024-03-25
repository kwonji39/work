//import statements go here

import java.util.Scanner;

//Javadoc goes here

/**
 * HW-05 -- MyMathHelper
 * <p>
 * This program takes in input from System.in,
 * performs calculation in Greatest Common Denominator
 * and Prime Factorization.
 *
 * @author Chan Um, L18
 * @version Feb 13, 2024
 */
public class MyMathHelper {

    public static final String WELCOME_MESSAGE = "Welcome to My Math Helper!";
    public static final String MAIN_MENU_ONE = "Please Select an Operation";
    public static final String MAIN_MENU_TWO = "1 - Calculate Greatest Common Denominator";
    public static final String MAIN_MENU_THREE = "2 - Perform Prime Factorization";
    public static final String MAIN_MENU_FOUR = "3 - Exit";
    public static final String GCD_NOTIFICATION = "Ready to Calculate Greatest Common Denominator";
    public static final String PF_NOTIFICATION = "Ready to Perform Prime Factorization";
    public static final String INPUT_ONE = "Please Enter an Integer";
    public static final String INPUT_TWO = "Please Enter a Second Integer";
    public static final String GCD_OUTPUT = "The Greatest Common Denominator is ";
    public static final String PF_OUTPUT = "The Prime Factorization is ";
    public static final String EXIT_MESSAGE = "Thank you for using My Math Helper!";
    public static final String INVALID_MENU_SELECTION = "Invalid selection!";
    public static final String INVALID_INPUT = "Invalid Input - Returning to Main Menu";

    public static void main(String[] args) {

        System.out.println(WELCOME_MESSAGE);

        Scanner scan = new Scanner(System.in);
        String ans;
        int flag = 0;

        do {
            if (flag == 0) {
                System.out.println(MAIN_MENU_ONE);
                System.out.println(MAIN_MENU_TWO);
                System.out.println(MAIN_MENU_THREE);
                System.out.println(MAIN_MENU_FOUR);
            }

            ans = scan.nextLine();

            switch (ans) {
                case "1":
                    System.out.println(GCD_NOTIFICATION);
                    System.out.println(INPUT_ONE);

                    if (scan.hasNextInt()) {
                        int input_1 = scan.nextInt();
                        if (input_1 <= 0) {
                            flag = 1;
                            break;
                        }
                        scan.nextLine();
                        System.out.println(INPUT_TWO);
                        if (scan.hasNextInt()) {
                            int input_2 = scan.nextInt();
                            if (input_2 <= 0) {
                                flag = 1;
                                break;
                            }
                            scan.nextLine();
                            
                            if (input_1 > 0 && input_2 > 0) {
                                int remainder;

                                do {
                                    remainder = (input_1 % input_2);
                                    input_1 = input_2;
                                    input_2 = remainder;

                                } while (remainder > 0);

                                System.out.println(GCD_OUTPUT + input_1);

                            } else {
                                flag = 1;
                            }
                        } else {
                            flag = 1;
                        }
                    } else {
                        flag = 1; //System.out.println(INVALID_INPUT);
                    }
                    break;


                case "2":
                    System.out.println(PF_NOTIFICATION);
                    System.out.println(INPUT_ONE);
                    if (scan.hasNextInt()) {
                        int input_3 = scan.nextInt();
                        if (input_3 <= 0) {
                            flag = 1;
                            break;
                        }
                        scan.nextLine();

                        if (input_3 >= 2) {

                            int count = 0;
                            for (int i = 2; i <= input_3; i++) {
                                while (input_3 % i == 0) {
                                    if (count == 0) {
                                        System.out.print(PF_OUTPUT + i);
                                        count++;
                                    } else {
                                        System.out.print(" x " + i);
                                    }
                                    input_3 /= i;
                                }
                            }
                            System.out.println();
                        } else {
                            flag = 1;
                        }
                    } else {
                        flag = 1;
                    }
                    break;

                case "3":
                    System.out.println(EXIT_MESSAGE);
                    break;

                default:
                if (flag == 1) {
                    System.out.println(INVALID_INPUT);
                    flag = 0;
                }
                else {
                    System.out.println(INVALID_MENU_SELECTION);
                }
            }


        } while (!ans.equals("3"));

    } // End main
} // End class