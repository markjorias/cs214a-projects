// A Java Program that will only accept an even number greater than or equal to 20

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number:  ");
        int num = scanner.nextInt();
		
		scanner.close();
		
		if  (num >= 20 && num % 2 == 0) {
			System.out.println("Number Accepted.");
		} else if (num <20 && num % 2 == 0) {
			System.out.println("Number Rejected. It is an Even number but less than 20.");
		} else {
			System.out.println("Number Rejected. It is an Odd Number");
        }
    }
}