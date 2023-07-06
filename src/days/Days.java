/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

import java.util.Scanner;

/**This class takes String input from user 
 * and calls method  to print the 
 * name of the day.
 * if the input is not given in String, 
 * program will accept and produce wrong results. 
 * change the code to use enums which avoids String input 
 * then print the week day names. 
 *
 * @author sivagamasrinivasan
 * This class takes a day number as input and calls the Weekdays class to print the name of the day.
 * The code has been modified to use enums for improved type safety and cohesion.
 */
public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the day number (1-7)");
        int code = in.nextInt();

        if (code >= 1 && code <= 7) {
            Weekdays.Day day = Weekdays.Day.values()[code - 1];
            Weekdays weekdays = new Weekdays();
            weekdays.printDayName(day);
        } else {
            System.out.println("Invalid day number!");
        }
    }
}