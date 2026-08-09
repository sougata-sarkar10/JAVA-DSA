import java.util.*;

public class BinaryTree17{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }

    public  static void levelOrder(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }

    public static int totalSum(Node root){
        if(root == null){
            return 0;
        }
        int leftSum  = totalSum(root.left);
        int rightSum = totalSum(root.right);

        return leftSum + rightSum + root.data;
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight,rightHeight)+1;
    }

    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }
        int diam1 = diameter1(root.left);
        int diam2 = diameter1(root.right);
        int diam3 = height(root.left) + height(root.right) + 1;

        return Math.max(diam3, Math.max(diam1,diam2));
    }

    static class treeInfo{
        int diam;
        int ht;
        treeInfo(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static treeInfo diameter2(Node root){
        if(root == null){
            return new treeInfo(0,0);
        }
        treeInfo left = diameter2(root.left);
        treeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht)+1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht + right.ht + 1;

        int myDiam = Math.max(diam3, Math.max(diam1,diam2));

        return new treeInfo(myDiam,myHeight);
    }

    public static void sumOfKthLevel(Node root, int k){
        if(root == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int level = 0;
        int sum = 0;
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                    level++;
                }
            }else{
                if(level == k){
                    sum += currNode.data;
                }
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
        System.out.println("Sum of Kth Level: "+sum);
    }
    public static void main(String arg[]){
        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,9,-1,-1};
        BinaryTree tree=new BinaryTree();

        Node root=tree.buildTree(nodes);
        System.out.println(root.data);
        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        postOrder(root);
        System.out.println();
        levelOrder(root);
        System.out.println("Total Nodes: "+countNodes(root));
        System.out.println("Total Sum: "+totalSum(root));
        System.out.println("Height: "+height(root));
        System.out.println("Diameter: "+diameter1(root));
        System.out.println("Diameter (Optimized): "+diameter2(root).diam);
        sumOfKthLevel(root,2);
    }
}