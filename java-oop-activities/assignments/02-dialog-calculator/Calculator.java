// Assignment 2: Calculator using JOptionPane | ORIAS BSCS2A

import javax.swing.JOptionPane;

public class Calculator {
    public static void main(String[] args) {
		
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number: "));
        double sum = num1 + num2;
        double difference = num1 - num2;
        double product = num1 * num2;
        double quotient = num1 / num2;
        double modulo = num1 % num2;
		
        JOptionPane.showMessageDialog(null, "SUM: " + num1 + " + " + num2 + " = " + sum +
                "\nDIFFERENCE: " + num1 + " - " + num2 + " = " + difference +
                "\nPRODUCT: " + num1 + " * " + num2 + " = " + product +
                "\nQUOTIENT: " + num1 + " / " + num2 + " = " + quotient +
                "\nMODULO: " + num1 + " % " + num2 + " = " + modulo, "Calculator Result", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}