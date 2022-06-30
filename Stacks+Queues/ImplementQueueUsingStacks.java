// Difficulty: Easy
// Technique used: Used 2 stacks

public class ImplementQueueUsingStacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        stack1.push(x);
    }
    
    public int pop() {
        while( !stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack2.pop();
        while( !stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return val;
    }
    
    public int peek() {
        while( !stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        int val = stack2.peek();
        while( !stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return val;
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
}
