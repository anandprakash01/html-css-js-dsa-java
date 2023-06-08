package J20_BST;

public class MirrorBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }
    public static void main(String[] args){
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(8);

        /*
                    5
                  /   \
                 3      7
               /  \   /    \
              2    4  6     8
        */
        root=createMirror(root);
        preOrder(root);
    }
    public static Node createMirror(Node root){
        if(root==null){
            return null;
        }
        Node leftS=createMirror(root.left);
        Node rightS=createMirror(root.right);

        root.left=rightS;
        root.right=leftS;
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
