// Difficulty: Easy
// Technique used: For loop from end and carrying over one for addition
// Runtime: O(n)



public class PlusOne {
    public int[] plusOne(int[] digits) {
        for( int i = digits.length-1; i >= 0; i-- ) {
            if( digits[i] < 9 ) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[digits.length+1];
        newDigits[0] = 1;
        return newDigits;
    }
}
