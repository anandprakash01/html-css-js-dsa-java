package J16_BST;

import java.util.LinkedList;
import java.util.Queue;

public class SortedArray2BalancedBST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val=val;
        }
    }

    public static void main(String[] args){
        int[] arr={3,5,6,8,10,11,12};

        TreeNode root= BuildBalancedBST(arr,0,arr.length-1);
        inOrder(root);
        System.out.println();
        levelOrder(root);
    }

    public static TreeNode BuildBalancedBST(int[] arr,int l,int r){
        if(l>r){
            return null;
        }
//        if(l==r){
//            return new TreeNode(arr[l]);
//        }
        int mid=(l+r)/2;
        TreeNode root=new TreeNode(arr[mid]);
        root.left=BuildBalancedBST(arr,l,mid-1);
        root.right=BuildBalancedBST(arr,mid+1,r);
        return root;
    }
    public static void inOrder(TreeNode root){
        if(root==null){
            return ;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }
    public static void levelOrder(TreeNode root){
        if(root==null){
            return ;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode curr=q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }
                else{
                    q.add(curr);
                }
            }
            else{
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
