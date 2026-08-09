import java.util.Stack;

public class StackQuestions {

    // Function to push an element at the bottom of a stack
    public static void pushAtBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.peek();
        s.pop();
        pushAtBottom(data, s);
        s.push(top);
    }

    //Pushj element at the bottom of stack using recursion
    public static void pushAtBottomrec(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottomrec(data, s);
        s.push(top);
    }

    //Reverse a stack 

    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(top, s);
    }
    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.peek() + " ");
            s.pop();
        }
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        // printStack(s); // Output: 3 2 1

        // pushAtBottom(4, s);
        // printStack(s);

        // pushAtBottomrec(5, s);
        // printStack(s);

        reverseStack(s);
        printStack(s);
    }
}
