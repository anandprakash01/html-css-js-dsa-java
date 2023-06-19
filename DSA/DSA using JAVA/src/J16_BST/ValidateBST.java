package J16_BST;

import java.util.ArrayList;

public class ValidateBST {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(3);
        root.right = new Node(7);
        root.left.left = new Node(2);
        root.left.right = new Node(4);
        root.right.left = new Node(6);
        root.right.right = new Node(1);

        /*
                    5
                  /   \
                 3      7
               /  \   /    \
              2    4  6     8
        */


        // Approach 1 ==> InOrderTraversal (should be sorted)
        ArrayList<Integer> list=new ArrayList<>();
        inOrder(root,list);
        System.out.println(list);
        boolean isValid=true;
        for(int i=1;i<list.size();i++){
            if(list.get(i-1)>list.get(i)){
                System.out.println("Not a BST");
                isValid=false;
                break;
            }
        }
        if(isValid){
            System.out.println("Valid BST");
        }

        // Approach 2==> this is better
        isValid=isValidBST(root,null,null);
        System.out.println(isValid);

    }
    public static boolean isValidBST(Node root,Node min,Node max){
        if(root==null){
            return true;
        }
        if(min!=null && root.val<=min.val){
            return false;
        }
        else if(max!=null && root.val>=max.val){
            return false;
        }
        return isValidBST(root.left,min,root) && isValidBST(root.right,root,max);
    }

    public static void inOrder(Node root, ArrayList<Integer> list){
        if(root==null){
            return ;
        }
        inOrder(root.left,list);
        list.add(root.val);
        inOrder(root.right,list);
    }
}
