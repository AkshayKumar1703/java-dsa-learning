import java.util.ArrayList;
class TwoPointers {
    public static ArrayList<Integer> alternateSort(int[] arr) {

        // Your code goes here
        Arrays.sort(arr);
        int len = arr.length;
        ArrayList<Integer> result = new ArrayList<>();
        
        int i = 0;
        int j = len - 1;
        
        while (i < j) {
            result.add(arr[j]);
            result.add(arr[i]);
            j--;
            i++;
        }
        
        if ( i == j ) {
            result.add(arr[i]);
        }
        
        return result;
        
    }
}
