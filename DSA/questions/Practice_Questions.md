# Two Pointer
### Ques 1 : problem link 
https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/

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


### Ques 2: Given an array arr consisting of only 0's and 1's in random order. Modify the array in-place to segregate 0s onto the left side and 1s onto the right side of the array. 
https://www.geeksforgeeks.org/problems/segregate-0s-and-1s5106/1?page=1&status=solved&sortBy=submissions


public class Solution {
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
# Triplet family.

  ### Ques 3:Given an array arr of integers. First sort the array then find whether three numbers are such that the sum of two elements equals the third element.
   
   // code
   public class Solution {
    public boolean findTriplet(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        for ( int k = n-1; k>=0; k--) {
            int i = 0;
            int j = k-1;
            while(i<j) {
                int sum = arr[i] + arr[j];
                if(sum == arr[k]) {
                    return true;
                }
                else if (sum<arr[k]) {
                    i++;
                }
                else {
                    j--;
                }
            }
        }
    return false;
    }
}


