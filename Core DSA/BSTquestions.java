public class BSTquestions { 
    // Made static so static methods can use it
    static class Node { 
        int data; 
        Node left; 
        Node right; 
        Node(int data) { 
            this.data = data; 
        } 
    } 

    public static int printInRange(Node root, int X, int Y) { 
        if (root == null) { 
            return 0; 
        } 
        if (root.data >= X && root.data <= Y) { 
            printInRange(root.left, X, Y); 
            System.out.print(root.data + " "); 
            printInRange(root.right, X, Y); 
        } else if (root.data < X) { 
            printInRange(root.right, X, Y); 
        } else { 
            printInRange(root.left, X, Y); 
        } 
        return 0; 
    } 

    public static Node insert(Node root, int val) { 
        if (root == null) { 
            root = new Node(val); 
            return root; 
        } 
        if (root.data > val) { 
            root.left = insert(root.left, val); 
        } else { 
            root.right = insert(root.right, val); 
        } 
        return root; 
    } 

    //Print root to leaf path
    public static void printRootToLeafPath(Node root, String path) { 
        if (root == null) { 
            return; 
        } 
        path += root.data + " "; 
        if (root.left == null && root.right == null) { 
            System.out.println(path); 
        } else { 
            printRootToLeafPath(root.left, path); 
            printRootToLeafPath(root.right, path); 
        } 
    }

    public static void inOrderTraversal(Node root) { 
        if (root == null) { 
            return; 
        } 
        inOrderTraversal(root.left); 
        System.out.print(root.data + " "); 
        inOrderTraversal(root.right); 
    }

    public static void main(String arg[]) { 
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14}; 
        Node root = null; 
        
        for (int i = 0; i < values.length; i++) { 
            // Fixed: passed 'root' and reassigned it to capture the updated tree
            root = insert(root, values[i]); 
        } 
        System.out.println("Inorder traversal of the given tree:");
        inOrderTraversal(root);
        System.out.println();
        printInRange(root, 5, 12); 
        System.out.println();
        printRootToLeafPath(root, ""); 
    } 
}
