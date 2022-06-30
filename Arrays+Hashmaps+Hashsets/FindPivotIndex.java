// Difficulty: Easy
// Technique used: For and (two pointers ish) loop
// Runtime: O(n)


public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        if( nums.length == 1 ) {
            return 0;
        }
        int sum = 0;
        for( int i = 0; i < nums.length; i++ ) {
            sum += nums[i];
        }
        int leftSum = 0;
        for( int i = 0; i < nums.length; i++ ) {
            if( leftSum == (sum - leftSum - nums[i] ) ) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
