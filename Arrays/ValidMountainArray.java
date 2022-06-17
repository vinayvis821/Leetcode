// Difficulty: Easy
// Technique used: For loop 
// Runtime: O(n)

public class Solution {
    public boolean validMountainArray(int[] arr) {
        if( arr.length < 3 ) {
            return false;
        }
        int max = 0;
        for( int i = 0; i < arr.length; i++ ) {
            max = arr[i] > arr[max] ? i : max;
        }
        if( max == 0 || max == arr.length-1) {
            return false;
        }
        for( int i = 0; i < max; i++ ) {
            if( arr[i] >= arr[i+1] ) {
                return false;
            }
        }
        
        for( int i = max; i < arr.length-1; i++ ) {
            if( arr[i] <= arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}