// Activity 4: Simple Calculator using BufferedReader | ORIAS BSCS2A

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please enter 1st number: ");
        double num1 = Double.parseDouble(reader.readLine());

        System.out.print("Please enter 2nd number: ");
        double num2 = Double.parseDouble(reader.readLine());

        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = (double) num1 / num2;
        double modulo = num1 % num2;

        System.out.println("\nThe Sum is: " + sum);
        System.out.println("The difference is: " + difference);
        System.out.println("The product is: " + product);
        System.out.println("The quotient is: " + quotient);
        System.out.println("The remainder is: " + modulo);
    }
}