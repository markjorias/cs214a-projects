// Assignment 3: Sort elements of an Array | ORIAS BSCS2A

import java.util.Scanner;

public class SortArray {
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
        System.out.print("\nOrder (type DES for Descending or ASC for Ascending): ");
        String order = input.next();
        if (order.equals("DES")) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] < array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } else if (order.equals("ASC")) {
            for (int i = 0; i < size; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (array[i] > array[j]) {
                        int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
        } else {
            System.out.println("\nInvalid order");
        }
        System.out.print("\nSorted array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        input.close();
    }
}