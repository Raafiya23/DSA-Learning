package unit3.Day9.HW;

import java.util.*;

public class ArrayDuplicates {
    public static void main(String[] args) {
        // Example array with duplicates
        int[] arr = {1, 2, 3, 2, 4, 1, 5, 3};

        // Using LinkedHashSet to maintain order and remove duplicates
        Set<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to array (optional)
        int[] uniqueArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            uniqueArr[i++] = num;
        }

        // Display result
        System.out.println("Array without duplicates: " + Arrays.toString(uniqueArr));
    }
}
