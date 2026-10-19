/* Prints the numbers that appear exactly once in an array.
 *
 *  Input Array Size: 5
 *  Input an Element: 1
 *  Input an Element: 2
 *  Input an Element: 3
 *  Input an Element: 3
 *  Input an Element: 5
 *  Unique Number(s): 1, 2, 5
 */

import java.util.Scanner;

public class UniqueNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Array Size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println();

        for (int i = 0; i < size; i++) {
            System.out.print("Input an Element: ");
            array[i] = input.nextInt();
        }
        System.out.print("\nUnique Number(s): ");
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (array[i] == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.print(array[i] + ", ");
            }
        }
        input.close();
    }
}
