package DSA.questions.arrays;

import java.util.*;
// solved this problem using two pointer
public class twoSum {
    public int[] TwoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0;
        int j = n-1;
        while(i<j) {
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else if (numbers[i] + numbers[j] > target) {
                j--;
            } else {
                return new int[] {i+1, j+1};
            }
        }
        return null;
    }
    public static void main(String[] args) {
        twoSum t = new twoSum();
        int[] numbers = {2,1,7,11};
        int target = 3;
        int[] result = t.TwoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }
}
