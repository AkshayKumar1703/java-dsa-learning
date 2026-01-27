package dsa.questions.arrays;
import java.util.*;
public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
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
        TwoSum t = new TwoSum();
        int[] numbers = {2,1,7,11};
     int target = 9;
     int[] result = t.twoSum(numbers, target);
     System.out.println(Arrays.toString(result));
    }
}
