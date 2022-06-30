// Difficulty: Easy
// Technique used: Recursion and hashset for storing previously computer numbers 
// Runtime: ?

public class FibonacciNumber {
    HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    
    public int fib(int n) {
        if( n <= 0 ) {
            return 0;
        } else if( n == 1 ) {
            return 1;
        } else {
            if( map.get(n) != null ) {
                return map.get(n);
            }
            int value = fib(n-1) + fib(n-2);
            map.put(n, value);
            return value;
        }
    }
}
