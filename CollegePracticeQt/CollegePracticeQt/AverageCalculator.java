
import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        calculateAverage();
    }

    public static void calculateAverage() {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get input from the user
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate the average
            double average = (num1 + num2) / 2;

            // Display the result
            System.out.println("The average is: " + average);
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Cannot calculate average. Division by zero.");
        } finally {
            // Close the scanner to avoid resource leak
            scanner.close();
        }
    }
}
