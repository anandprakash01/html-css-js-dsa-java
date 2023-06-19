package J16_BST;

import java.util.ArrayList;

public class MergeTwoBST {

    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {

        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root=mergeBST(root1,root2);
        preOrder(root);

    }

    public static Node mergeBST(Node root1,Node root2){
        ArrayList<Integer> seq1=new ArrayList<>();
        ArrayList<Integer> seq2=new ArrayList<>();
        ArrayList<Integer> seq=new ArrayList<>();
        getinOrderSeq(root1,seq1);
        getinOrderSeq(root2,seq2);
        int i=0;
        int j=0;
        while(i<seq1.size() && j<seq2.size()){
            if(seq1.get(i)<seq2.get(j)){
                seq.add(seq1.get(i++));
            }
            else{
                seq.add(seq2.get(j++));
            }
        }
        while(i<seq1.size()){
            seq.add(seq1.get(i++));
        }
        while(j<seq2.size()){
            seq.add(seq2.get(j++));
        }
        return createBST(seq,0,seq.size()-1);

    }
    public static Node createBST(ArrayList<Integer> seq,int l,int r){
        if(l>r){
            return null;
        }
        int mid=(l+r)/2;
        Node root=new Node(seq.get(mid));
        root.left= createBST(seq,l,mid-1);
        root.right= createBST(seq,mid+1,r);
        return root;
    }

    public static void getinOrderSeq(Node root,ArrayList<Integer> list){
        if(root==null){
            return;
        }
        getinOrderSeq(root.left,list);
        list.add(root.val);
        getinOrderSeq(root.right,list);
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
