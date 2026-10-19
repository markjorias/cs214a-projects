/* A java program that swaps two succeeding numbers in an array

example
Enter array size: 5

Enter an element: 1
Enter an element: 2
Enter an element: 3
Enter an element: 4
Enter an element: 5

OUTPUT: 2 1 4 3 5

the program should only swap index 0 and 1, 2 and 3, 4 and 5. If the array size is odd, the last number will not be swapped
*/

import java.util.Scanner;

public class SwapAdjacent
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter an element: ");
            array[i] = input.nextInt();
        }
        for (int i = 0; i < size - 1; i += 2) {
            int temp = array[i];
            array[i] = array[i + 1];
            array[i + 1] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}