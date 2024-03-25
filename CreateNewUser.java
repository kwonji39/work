
import java.util.Scanner;

/**
 * HW-03 -- CreateNewUser
 *
 * This program takes in input from System.in
 * performs string manipulation and returns a user String
 *
 * @author Chan Um, L18
 *
 * @version Jan 27, 2024
 *
 */

public class CreateNewUser {

    // List of public static final strings provided to prevent typos

    public static final String PROMPT_ONE = "Enter Customer First Name:";
    public static final String PROMPT_TWO = "Enter Customer Last Name:";
    public static final String PROMPT_THREE = "Enter Customer Age:";
    public static final String PROMPT_FOUR = "Enter Customer Street Address:";
    public static final String PROMPT_FIVE = "Enter Customer City:";
    public static final String PROMPT_SIX = "Enter Customer State:";
    public static final String PROMPT_SEVEN = "Enter Customer Zip Code:";
    public static final String PROMPT_EIGHT = "Enter Customer Phone Number:";
    public static final String OUTPUT = "The Assigned User String is ";

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println(PROMPT_ONE);
        String fn = scan.nextLine();
        String fn_result = fn.substring(0, 1) + fn.substring(fn.length() - 1);

        System.out.println(PROMPT_TWO);
        String ln = scan.nextLine();
        String ln_result = ln.substring(0, 2);

        System.out.println(PROMPT_THREE);
        String age = scan.nextLine();
        String age_result = age.substring(0, 1);
        String age_result2 = age.substring(1);

        int age_result22 = Integer.parseInt(age_result2);
        String s = Integer.toBinaryString(age_result22);
        int age_binary = Integer.parseInt(s);
        String age_binary_format = String.format("%04d", age_binary);

        System.out.println(PROMPT_FOUR);
        String street = scan.nextLine();
        String street_result = street.replaceAll("\\s", "");

        System.out.println(PROMPT_FIVE);
        String city = scan.nextLine();
        String city_result = city.substring(0, 2);

        System.out.println(PROMPT_SIX);
        String state = scan.nextLine();
        String state1 = state.toUpperCase();
        int ascii = (int) state1.charAt(0);
        int ascii2 = (int) state1.charAt(1);
        int final_ascii = ascii + ascii2;

        System.out.println(PROMPT_SEVEN);
        String zip = scan.nextLine();
        String zip1 = zip.substring(0, 1);
        String zip2 = zip.substring(2, 3);
        int zip_result = Integer.parseInt(zip1) + Integer.parseInt(zip2);

        System.out.println(PROMPT_EIGHT);
        String phone = scan.nextLine();
        String phone_result = phone.substring(phone.length() - 4);

        String input = fn + ln + age + street + city + state + zip + phone;
        int input_length = input.length();

        String temp = input_length + age_result + ln_result.toUpperCase() + fn_result.toLowerCase() + age_binary_format
                + street_result.toUpperCase() + " " + city_result.toUpperCase() + final_ascii + zip_result
                + phone_result;
        String replace_O = temp.replace("O", "");
        String replace_I = replace_O.replace("I", "");

        System.out.println("The Assigned User String is " + replace_I);

    } // End Main method

} // End CreateNewUser.class
