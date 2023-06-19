package J16_BST;

public class PrintInRange {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args){
        Node root=new Node(5);
        root.left=new Node(3);
        root.right=new Node(7);
        root.left.left=new Node(2);
        root.left.right=new Node(4);
        root.right.right=new Node(8);

        /*
                    5
                  /   \
                 3      7
               /  \   /    \
              2    4  null  8
        */

        printRange(root,2,7);
    }
    public static void printRange(Node root,int k1,int k2){
        if(root==null){
            return;
        }
        if(root.val>=k1 && root.val<=k2){
            printRange(root.left,k1,k2);
            System.out.print(root.val+" ");
            printRange(root.right,k1,k2);
        }
        else if(root.val>k2){
            printRange(root.left,k1,k2);
        }
        else{
            printRange(root.right,k1,k2);
        }
    }
}
