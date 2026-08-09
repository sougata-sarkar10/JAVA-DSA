
import java.util.*;

public class Queue16{
    //Queue using Array
    static class Queue1{
        static int arr[];
        static int size;
        static int rear = -1;

        Queue1(int n){
            arr = new int[n];
            size = n;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        //Enqueue / add
        public static void add(int data){
            if(rear == size - 1){
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        //Dequeue / remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front =  arr[0];
            for(int i = 0; i < rear; i++){
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }
    } 

    //Queue using Linked List

    static class Queue2{
        static class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty(){
            return head == null && tail == null;
        }

        //Enqueue / add
        public static void add(int data){
            Node newNode = new Node(data);
            if(head == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }
        
        //Dequeue / remove
        public static int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            int front = head.data;
            if(tail == head){
                tail = head = null;
            }else{
                head = head.next;
            }
            return front;
        }

        //Peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }


    // public static void main(String[] arg){
    //     //using array
    //     Queue1 q1 = new Queue1(5);
    //     q1.add(1);
    //     q1.add(2);
    //     q1.add(3);
    //     while(!q1.isEmpty()){
    //         System.out.println(q1.peek());
    //         q1.remove();
    //     }
    //     q1.peek();

    //     //using linked list
    //     Queue2 q2 = new Queue2();
    //     q2.add(1);
    //     q2.add(2);
    //     q2.add(3);
    //     while(!q2.isEmpty()){
    //         System.out.println(q2.peek());
    //         q2.remove();
    //     }
    // }

    //Impementing queue using java collection framework
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q1 = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q1.add(1);
        q1.add(2);
        q1.add(3);
        while(!q1.isEmpty()){
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}