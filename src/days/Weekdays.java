/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;


/**
 * This class represents the weekdays and provides a method to print the name of a given day.
 */
public class Weekdays {
    /**
     * Enum to represent the days of the week.
     */
    public enum Day {
        ONE("Monday"),
        TWO("Tuesday"),
        THREE("Wednesday"),
        FOUR("Thursday"),
        FIVE("Friday"),
        SIX("Saturday"),
        SEVEN("Sunday");

        private final String name;

        Day(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    /**
     * Prints the name of the given day.
     * @param day The day for which the name should be printed.
     */
    public void printDayName(Day day) {
        System.out.println(day.getName());
    }
}

