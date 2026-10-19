// A multiplication table using for loop

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Input the Main Number: ");
        int num = input.nextInt();

        System.out.println("How many Loops: ");
        int loop = input.nextInt();

        input.close();

        for (int i = 1; i <= loop; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
