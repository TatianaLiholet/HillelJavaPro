package lesson5;

import java.util.Scanner;

public class Calculator {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first  number");
        double operandFirst = scanner.nextDouble();
        System.out.println("Enter what operation do you want: + ,  - , * , / ");
        String sign = scanner.next();
        System.out.println("Enter second number");
        double operandSecond = scanner.nextDouble();
        switch (sign) {
            case "+":
                System.out.println("The sum is :" + (operandFirst + operandSecond));
                break;
            case "-":
                System.out.println("The minus is :" + (operandFirst - operandSecond));
                break;
            case "*":
                System.out.println("The multiplication is :" + (operandFirst * operandSecond));
                break;
            case "/":
                if (operandSecond == 0) {
                    System.err.println("We can't devade on 0");
                }
                System.out.println("The multiplication is :" + (operandFirst / operandSecond));
        }
    }
}
