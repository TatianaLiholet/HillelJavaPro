package lesson2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, this is Monobank, lets count your deposit ");
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your surname:");
        String surname = scanner.nextLine();
        System.out.println("What sum do you want to put on a deposit:");
        double sum = scanner.nextDouble();
        double percentageForYear = 0.05;
        double percentageForFiveYears = 0.10;
        double percentageForTenYears = 0.15;
        double sumAfterYear = sum + (sum * percentageForYear);
        double sumAfterFiveYears = sum + (percentageForFiveYears * sum);
        double sumAfterTenYears = sum + (percentageForTenYears * sum);
        DecimalFormat newFormat = new DecimalFormat("#.##");

        System.out.println("Dear" + name + " " + surname + " " + "this is your report: You will receive after one year " + newFormat.format(sumAfterYear) + "$");
        System.out.println("You will receive after five year " + newFormat.format(sumAfterFiveYears) + "$");
        System.out.println("You will receive after ten year " + newFormat.format(sumAfterTenYears) + "$");
    }
}
