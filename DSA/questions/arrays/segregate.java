package DSA.questions.arrays;


// Ques 2: Given an array arr consisting of only 0's and 1's in random order.
// Modify the array in-place to segregate 0s onto the left side
// and 1s onto the right side of the array.
public class segregate {
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

