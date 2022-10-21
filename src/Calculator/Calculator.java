package Calculator;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Calculator {

    static Scanner scanner = new Scanner(System.in);

    public static double getNum() {
        System.out.println("Enter number:");
        double num;
        num = scanner.nextDouble();
        return num;
    }

    public void doCalculation(double num1, double num2, char operation) {
        double result;
        switch (operation) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                result = num1 / num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("You entered non-valid operation");
        }
    }

    public char getOperation() {
        char operation;
        System.out.println("Enter operation:");
        return scanner.next().charAt(0);
    }

    public double getNumber(){
        System.out.println("Enter number");
        double num = scanner.nextInt();
        return num;
    }

}
