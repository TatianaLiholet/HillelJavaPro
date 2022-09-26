package lesson3;

import java.sql.Array;

public class TaskMethods {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign(int a, int b) {
        int sum = a + b;
        if (sum >= 0) {
            System.out.println("Sum is positive");
        }
        System.out.println("The sum is negative");
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Red");
        } else if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } else System.out.println("Green");
    }


    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println(a >= b);
        } else System.out.println("a < b");
    }

    public static void compareSumOfNumbers(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            System.out.println("true");
        } else System.out.println("false");

    }

    public static void comparePositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Positive number " + a);
        }
        System.out.println("Negative number " + a);
    }

    public static void comparePositiveOrNegativeValue(int a) {
        if (a >= 0) {
            System.out.println("false");
        }
        System.out.println("true");
    }

    public static void printText(String text, int time) {
        while (time > 0) {
            System.out.println(text);
            time--;
        }
    }

    public static void yearLeapYear(int year) {
        if ((year % 100 == 0 && year % 400 == 0) || (year % 100 != 0 && year % 4 == 0)) {
            System.out.println("A leap year");
        } else System.out.println("Not a leap year");


    }
}















