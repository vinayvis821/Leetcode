// Difficulty: Easy
// Technique used: Hashset to get jewels, for each loop to check if stone is jewel
// Runtime: O(n)

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        int countOfJewels = 0;
        HashSet<Character> set = new HashSet<Character>();
        for( char c: jewels.toCharArray() ) {
            set.add(c);
        }
        for( char c: stones.toCharArray() ) {
            if( set.contains(c) ) {
                countOfJewels++;
            }
        }
        return countOfJewels;
    }
}
