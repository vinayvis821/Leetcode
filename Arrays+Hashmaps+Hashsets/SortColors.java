// Difficulty: Medium
// Technique used: For each loop and hash set 
// Runtime: O(n)

public class SortColors {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,0);
        map.put(1,0);
        map.put(2,0);
        for( int num: nums ) {
            map.put( num, map.getOrDefault(num,0)+1);
        }
        int colorTracker = 0;
        for( int i = 0; i < nums.length; i++ ) {
            while( map.get(colorTracker) == 0 ) {
                colorTracker++;
            }
            nums[i] = colorTracker;
            map.put(colorTracker, map.get(colorTracker) - 1);
        }
        
    }
}
