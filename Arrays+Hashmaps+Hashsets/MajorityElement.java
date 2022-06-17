// Difficulty: Easy
// Technique used: For each loop and hashmap 
// Runtime: O(n)

public class MajorityElement {
    public int majorityElement(int[] nums) {
        int majority = nums.length/2;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for( int num : nums ) {
            map.put( num, map.getOrDefault(num,0) + 1);
            if( map.get(num) > majority ) {
                return num;
            }
        }
        return 0;
    }
}
