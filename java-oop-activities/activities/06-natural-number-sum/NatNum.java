// Activity 6: Sum of Natural Numbers | ORIAS BSCS2A

import java.util.Scanner;

public class NatNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input NumStart: ");
        int numStart = input.nextInt();
        System.out.print("Input NumEnd: ");
        int numEnd = input.nextInt();
        
        int sum = 0;
        for (int i = numStart; i <= numEnd; i++) {
            sum += i;
        }
        System.out.println("The Sum is " + sum);
        
        input.close();
    }
}
