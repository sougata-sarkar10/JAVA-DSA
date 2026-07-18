import java.util.*;
public class StackClass15 { 
    //Stack with Linked List

    static class Node { 
        int data; 
        Node next; 
        
        public Node(int data) { 
            this.data = data; 
            this.next = null; 
        } 
    } 

    static class Stack1 { 
        public Node head; 

        public boolean isEmpty() { 
            return head == null;
        }

        public void push(int data) { 
            Node newNode = new Node(data); 
            if (head == null) { 
                head = newNode; 
                return; 
            } 
            newNode.next = head; 
            head = newNode; 
        } 

        public void pop() { 
            if (head == null) { 
                System.out.println("Stack is empty"); 
                return; 
            } 
            head = head.next; 
        }

        public int peek() {
            if (head == null) { 
                System.out.println("Stack is empty"); 
                return -1; 
            } 
            return head.data; 
        }

        public void printStack() { 
            Node current = head; 
            while (current != null) { 
                System.out.println(current.data + " "); 
                current = current.next; 
            } 
            System.out.println(); 
        }
    } 

    //Stack with ArrayList

    static class Stack2{
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty(){
            return list.size() == 0;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public static int peek(){
            return list.get(list.size() - 1);
        }

        public static void printStack(){
            for(int i=0;i<=list.size()-1;i++){
                System.out.println(list.get(i) + " ");
            }
        }
    }
    public static void main(String[] args) { 

        //With LL

        Stack1 s1 = new Stack1(); 
        s1.push(1); 
        s1.push(2);
        s1.push(3);
        System.out.println("Peak element: " + s1.peek()); // Output: 3
        System.err.println();
        s1.printStack();
        s1.pop();
        System.out.println("Peak element: " + s1.peek()); // Output: 2

        //With ArrayList
        Stack2 s2 = new Stack2();

        s2.push(10);
        s2.push(20);
        s2.push(30);
        System.out.println("Peak element: " + s2.peek()); // Output: 30
        s2.pop();

        s2.printStack(); // Output: 10 20

        //with java collection framework
        Stack<Integer> s3 = new Stack<>();
        s3.push(100);
        s3.push(200);
        s3.push(300);
        System.out.println("Peak element: " + s3.peek()); // Output: 300
        s3.pop();
        System.out.println("Peak element: " + s3.peek()); // Output: 200
        
        while(!s3.isEmpty()){
            System.out.println(s3.pop());
        }
    } 
}
