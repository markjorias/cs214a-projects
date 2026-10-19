// Activity 3: Simple Calculator using Scanner Class | ORIAS BSCS2A

import java.util.Scanner;

public class ScannerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter 1st number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Please enter 2nd number: ");
        double num2 = scanner.nextDouble();

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;

        System.out.println("\nThe Sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + modulo);

        scanner.close();
    }
}