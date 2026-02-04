package dsa.questions.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoPointers {

    /* 1) Reverse an Array
       Example:
       Input: [1,2,3,4,5] → Output: [5,4,3,2,1]
       Hint: Use two pointers.
    */
    public static void reverseArray(List<Integer> numbers) {
        int left = 0;
        int right = numbers.size() - 1;
        while (left < right) {
            int temp = numbers.get(left);
            numbers.set(left, numbers.get(right));
            numbers.set(right, temp);
            left++;
            right--;
        }
        System.out.println(numbers);
    }

    /* 2) Rearrange array as largest, smallest, 2nd largest, 2nd smallest, .. */
    public static ArrayList<Integer> alternateSort(int[] arr) {
        Arrays.sort(arr); // Sort
        int len = arr.length;
        ArrayList<Integer> result = new ArrayList<>();

        int i = 0;
        int j = len - 1;
        while (i < j) {
            result.add(arr[j--]);
            result.add(arr[i++]);
        }
        if (i == j) { // For odd length arrays
            result.add(arr[i]);
        }
        return result;
    }

    /* 3) Check if there exists a triplet such that arr[i] + arr[j] = arr[k] */
    public static boolean findTriplet(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr); // sort array first
        for (int k = n - 1; k >= 0; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (arr[i] + arr[j] == arr[k]) {
                    return true;
                } else if (arr[i] + arr[j] < arr[k]) {
                    i++;
                } else {
                    j--;
                }
            }
        }
        return false;
    }

    /* 4) Move all zeros to the end */
    public static void moveZeros(int[] arr) {
        int j = arr.length - 1;

        for (int i = 0; i < j;) {
            if (arr[i] != 0) {
                i++;
            } else if (arr[j] == 0) {
                j--;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {0, 1, 0, 3, 12};
        int[] arr3 = {1, 2, 3, 4, 5};

        System.out.println("Reversed Array:");
        reverseArray(numbers);

        System.out.println("Alternate Sorted Array:");
        System.out.println(alternateSort(arr3));

        System.out.println("Triplet exists? " + findTriplet(arr));

        System.out.println("Move Zeros to End:");
        moveZeros(arr2);
    }
}
