public class BST18 {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left,val);
        }
        else{
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static  int inOrderTraversal(Node root){
        if( root == null){
            return 0;
        }
        inOrderTraversal(root.left);
        System.out.print(root.data+" ");
        inOrderTraversal(root.right);
        return 0;
    }

    public static boolean search(Node root,int key){
        if (root == null) { 
            return false; 
        }
        if (root.data == key) { 
            return true; 
        }
    
        if (root.data > key) { 
            return search(root.left, key); 
        }else { 
            return search(root.right, key); 
        }
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root;
    }
    public static Node delete(Node root,int key){
        if(root == null){
            return null;
        }

        if(root.data > key){
            root.left = delete(root.left,key);
        }
        else if(root.data < key){
            root.right = delete(root.right,key);
        }
        else{
            //case 1
            if(root.left == null && root.right == null){
                return null;
            }
            //case 2
            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }
            //case 3
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }
        return root;
    }
    public static void main(String arg[]){
        int values[] = {5,1,3,4,2,7};

        BST18 tree = new BST18();
        Node root = null;
        
        for(int i=0;i<values.length;i++){
            root = insert(root,values[i]);
        }
        System.out.println("Inorder traversal of the given tree");
        inOrderTraversal(root);

        if(search(root,2)){
            System.out.println("\nKey is present");
        }
        else{
            System.out.println("\nKey is not present");
        }

        root = delete(root,2);
        System.out.println("Inorder traversal of the modified tree");
        inOrderTraversal(root);
    }
}
