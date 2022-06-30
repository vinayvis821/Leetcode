// Difficulty: Easy
// Technique used: Stack to check if valid. Only pushing for left, and popping for right
// Runtime: O(n)
public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for( char c : s.toCharArray() ) {
            if( c == '(' || c == '[' || c == '{' ) {
                stack.push(c);
            } else {
                if( stack.isEmpty() ) {
                    return false;
                }
                char popped = stack.pop();
                if( popped == '(' && c != ')' ) {
                    return false;
                } else if( popped == '[' && c != ']' ) {
                    return false;
                } else if( popped == '{' && c != '}' ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
