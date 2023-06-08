package J20_BST;

import java.util.LinkedList;
import java.util.Queue;

public class BuildBST {
    static class Node {
        Node left;
        Node right;
        int val;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;
        for (int i : values) {
            root = buildBST(root, i);
        }
        levelOrder(root);
        inOrder(root);

    }

    public static Node buildBST(Node root,int n){
        if(root==null){
            Node newNode=new Node(n);
            return newNode;
        }
        if(n<root.val){
            root.left=buildBST(root.left,n);
        }
        else{
            root.right=buildBST(root.right,n);
        }
        return root;
    }

    public static void levelOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    return;
                }else{
                    q.add(curr);
                }
            }else{
                System.out.print(curr.val+" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null) {
                    q.add(curr.right);
                }
            }
        }
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
}
