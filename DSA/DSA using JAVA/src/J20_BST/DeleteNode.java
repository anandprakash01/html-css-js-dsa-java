package J20_BST;

import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.right = new Node(8);
        root.right.left= new Node(6);

        /*
                    5
                  /   \
                 3      7
               /  \    /  \
              2    4  6    8

         */
        inOrder(root);
        System.out.println();
        levelOrder(root);
        delete(root,7);// returns root Node
        inOrder(root);
        levelOrder(root);
    }
    public static Node delete(Node root,int n){
        if(n<root.val){
            root.left=delete(root.left,n);
        }
        else if(n>root.val){
            root.right=delete(root.right,n);
        }
        else{//root.val==n
//            case 1: No child
            if(root.left==null && root.right==null){
                return null;
            }
//            case 2: Only one child
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
            }
//            case 3: both child exist
            Node IS=inorderSuccessor(root.right);
            root.val=IS.val;
            root.right=delete(root.right,IS.val);
        }

        return root;
    }
    public static Node inorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
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
                System.out.print(curr.val +" ");
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
}
