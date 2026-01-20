Ques 1 : problem link https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

class Solution {
   public int[] twoSum(int[] numbers, int target) {
      
   int i = 0;
       int j = numbers.length-1;
       while(i<j) {
            int sum = numbers[i] + numbers[j];
                   if(sum == target) {
                       return new int[] {i+1,j+1};
                   }
                   if(sum <  target) {
                       i++;
                   }
                   else if(sum > target) {
                       j--;
                   }
               }
      return new int[] {-1,-1};
   }
}


Ques 2: Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array.
Examples :
Input: arr[] = [0, 0, 1, 1, 0]
Output: [0, 0, 0, 1, 1]
Explanation:  After segregation, all the 0's are on the left and 1's are on the right. The modified array will be [0, 0, 0, 1, 1].
Input: arr[] = [1, 1, 1, 1]
Output: [1, 1, 1, 1]
Explanation: There are no 0s in the given array, so the modified array is [1, 1, 1, 1]
Expected Time Complexity: O(n)
Expected Auxiliary Space: O(1)
Constraints:
1 ≤ arr.size() ≤ 106
0 ≤ arr[i] ≤ 1


class Solution {
   void segregate0and1(int[] arr) {
       // code here
       int i = 0;
       int j = arr.length-1;
       while(i<=j) {
           if(arr[i] == 0){
               i++;
           }
           else if(arr[j]==1){
               j--;
           }
           else {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j--;
           }
       }
   }
 }

  

