// Difficulty: Easy
// Technique used: For loop and hashmap 
// Runtime: O(n)
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for( int i = 0; i < nums.length; i++ ) {
            int num = nums[i];
            int addToReachTarget = target-num;
            if( map.containsKey(addToReachTarget) ) {
                return new int[] {i, map.get(addToReachTarget)};
                
            } else {
                map.put( num, i );
            }
        }
        return null;
    }
}
