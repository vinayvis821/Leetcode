// Difficulty: Easy
// Technique used: Hashmap
// Runtime: O(a+b)
public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for( char c : magazine.toCharArray() ) {
            map.put( c, map.getOrDefault(c,0)+1);
        }
        for( char c : ransomNote.toCharArray() ) {
            if( map.get(c) == null || map.get(c) == 0 ) {
                return false;
            } else {
                map.put( c, map.get(c)-1);
            }
        }
        return true;
    }
}
