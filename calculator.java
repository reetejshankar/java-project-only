
import java.util.Scanner;

public class calculator {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            System.out.println("Select an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            int operation = scanner.nextInt();

            double result = 0;

            switch (operation) {
                case 1 ->
                    result = num1 + num2;
                case 2 ->
                    result = num1 - num2;
                case 3 ->
                    result = num1 * num2;
                case 4 ->
                    result = num1 / num2;
                default ->
                    System.out.println("Invalid operation");
            }

            System.out.println("Result: " + result);
        }
    }
}
