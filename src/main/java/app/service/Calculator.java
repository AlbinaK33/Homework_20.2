package app.service;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Calculator {

    private final Scanner scanner = new Scanner(System.in);

    public void runCalculator() {
        while (true) {
            System.out.println("""
        Choose an operation:
        1. Add
        2. Subtract
        3. Multiply
        4. Divide
        0. Exit
        """);

            int operator = scanner.nextInt();

            if (operator == 0) {
                System.out.println("Exiting calculator. Goodbye!");
                break;
            }

            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            switch (operator) {
                case 1:
                    System.out.println("Result: " + add(num1, num2));
                    break;
                case 2:
                    System.out.println("Result: " + subtract(num1, num2));
                    break;
                case 3:
                    System.out.println("Result: " + multiply(num1, num2));
                    break;
                case 4:
                    try {
                        System.out.println("Result: " + divide(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please enter a valid operation.");
            }
        }
    }

    public int add(int a, int b) { return a + b;}

    public int subtract(int a, int b) { return a - b;}

    public int multiply(int a, int b) { return a * b;}

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
