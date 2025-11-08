package unit3.Day9.HW;

import java.util.Arrays;

public class LeftRotationUsingRecursive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 3;
        rotateLeft(arr, k);
        System.out.println("After " + k + " left rotations: " + Arrays.toString(arr));
    }

    static void rotateLeft(int[] arr, int k) {
        if (k == 0) return; // base case

        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;

        System.out.println(Arrays.toString(arr));
        // recursive call
        rotateLeft(arr, k - 1);
    }
}
