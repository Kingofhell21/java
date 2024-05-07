package amber;

import java.util.Scanner;

public class largesmallarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        findLargestAndSmallest(array);

        scanner.close();
    }

    private static void findLargestAndSmallest(int[] array) {
        if (array.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallest = array[0];
        int largest = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            } else if (array[i] > largest) {
                largest = array[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}
