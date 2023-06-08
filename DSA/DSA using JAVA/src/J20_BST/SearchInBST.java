package J20_BST;

import java.util.LinkedList;
import java.util.Queue;

public class SearchInBST {
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
        inOrder(root);
        System.out.println(search(root,4));
        levelOrder(root);

    }

    public static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.val==key){
            return true;
        }

        if(key<root.val){
            return search(root.left,key);
        }
        else{
            return search(root.right,key);
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
                }
                else{
                    q.add(curr);
                }
            }else{
                System.out.print(curr.val+" ");
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
