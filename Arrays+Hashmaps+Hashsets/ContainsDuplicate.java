// Difficulty: Easy
// Technique used: For each loop and hash set 
// Runtime: O(n)

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for( int num : nums ) {
            if( set.contains(num) ) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
