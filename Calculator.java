import java.util.Scanner;

public class Calculator {
    public static double add(double a, double b) {
        return a+b;
    }

    public static double subtract(double a, double b) {
        return a-b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
            return Double.NaN;
        }
        return a / b;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter operation (+, -, *, /) or x to exit:");
            String op = scanner.next();
            if (op.equals("x")) break;
            System.out.println("Enter first number:");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number:");
            double num2 = scanner.nextDouble();
            double result;
            switch(op) {
                case "+": result = add(num1, num2); break;
                case "-": result = subtract(num1, num2); break;
                case "*": result = multiply(num1, num2); break;
                case "/": result = divide(num1, num2); break;
                default:
                    System.out.println("Unknown operation");
                    continue;
            }
            System.out.println("Result: " + result);
        }
        scanner.close();
    }
}
