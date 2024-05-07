package amber;

import java.util.ArrayList;

public class sumeven {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add some numbers to the ArrayList
        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(10);
        numbers.add(15);

        // Calculate the sum of even numbers
        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);

        // Display the result
        System.out.println("ArrayList: " + numbers);
        System.out.println("Sum of Even Numbers: " + sumOfEvenNumbers);
    }

    // Method to calculate the sum of even numbers in an ArrayList
    private static int calculateSumOfEvenNumbers(ArrayList<Integer> list) {
        int sum = 0;

        for (int number : list) {
            if (number % 2 == 0) {
                sum += number;
            }
        }

        return sum;
    }
}
