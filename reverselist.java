package amber;

import java.util.ArrayList;
import java.util.List;

public class reverselist {
    public static void main(String[] args) {
        // Create a List of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.add("Fig");

        // Display the original list
        System.out.println("Original List: " + stringList);

        // Reverse the list
        reverseList(stringList);

        // Display the reversed list
        System.out.println("Reversed List: " + stringList);
    }

    // Method to reverse a List of strings
    private static void reverseList(List<String> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            String temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move indices towards the center
            left++;
            right--;
        }
    }
}
