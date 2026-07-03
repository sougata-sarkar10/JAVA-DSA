
public class LL13 {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    } 
    
    //Add - First & Last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = new Node(data);
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = new Node(data);
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

    public static void main(String[] args) {
        LL13 list = new LL13();

        list.addFirst("is");
        list.addFirst("this");
        list.addLast("linked");
        list.addLast("list");
        list.printList();
    }
    
}
