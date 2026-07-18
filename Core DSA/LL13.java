
public class LL13 {
    Node head;

    private int size;

    LL13(){
        this.size = 0;
    }
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    } 
    
    //Add - First & Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode; 
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }

    // Delete Node
    public void deleteFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }
        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }

    //Reverse a linked list
    public void reverseListIterative(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            //Update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    private Node reverseListRecursiveHelper(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node newHead = reverseListRecursiveHelper(node.next);
        node.next.next = node;
        node.next = null;
        return newHead;
    }

    public void reverseListRecursive(){
        if(head == null || head.next == null){
            return;
        }
        reverseListRecursiveHelper(head);
    }

    public static void main(String[] args) {
        LL13 list = new LL13();

        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linked");
        list.addLast("list");
        list.printList();

        list.deleteFirst();
        list.printList();   

        list.deleteLast();
        list.printList();

        System.out.println(list.getSize());

        list.reverseListIterative();
        list.printList();

        list.reverseListRecursive();
        list.printList();
    }
    
}
