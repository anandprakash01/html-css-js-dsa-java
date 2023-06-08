package J20_BST;

import java.util.ArrayList;

public class Path_Root2Leaf {
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
        root.right.right = new Node(8);
        root.right.left = new Node(6);

        /*
                    5
                  /   \
                 3      7
               /  \   /    \
              2    4  6     8
        */
        printPath2Leaf(root,new ArrayList<Integer>());
    }

    public static void printPath2Leaf(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.val);
        if(root.left==null && root.right==null){
            for(int i:list){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        printPath2Leaf(root.left,list);
        printPath2Leaf(root.right,list);
        list.remove(list.size()-1);
    }
}
