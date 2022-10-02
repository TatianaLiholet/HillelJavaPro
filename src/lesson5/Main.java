package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "ZюукяДZіботZ,ежобZощZяZенZ!ьлаксом";
        String textAfterReverce = new StringBuilder(text).reverse().toString().replace('Z', ' ');
        String[] textForSplit = textAfterReverce.split(" ");
        for (int i = textForSplit.length - 1; i >= 0; i--) {
            System.out.print(textForSplit[i] + " ");

        }
        System.out.println();
        
        System.out.println("The second task -------------------------------");

        Scanner scanner = new Scanner(System.in);
        Calculator.calculate();
        System.out.println("Do you want to make another operation? " + "Enter the 'Yes' or 'exit' ");
        String answer = scanner.next();
        if (answer.equals("exit")) {
            System.exit(0);

        } else if (answer.equals("Yes")) {
            Calculator.calculate();

        }
        System.err.println("We don't understand you");

    }


}
