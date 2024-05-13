package J19_Tries;

import java.util.ArrayList;

public class PrefixProblem {
    static class Node{
        Node[] children=new Node[26];
        boolean eow=false;
        int fre;
//        int fre=1;
        Node(){
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            fre=1;
        }
    }
    public static Node root= new Node();

    public static void insert(String word){
        Node curr=root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx]==null){
                curr.children[idx] = new Node();
            }
            else{
                curr.children[idx].fre++;
            }
            curr=curr.children[idx];
        }
        curr.eow = true;
    }

    public static void findPrefix(Node root,String ans,ArrayList<String> ansArr){
        if(root == null){
            return;
        }
        if(root.fre == 1){
            ansArr.add(ans);
            System.out.println(ans);
            return;
        }
        for(int i=0; i<root.children.length; i++){// root.children.length = 26

            if(root.children[i] != null ){
                findPrefix(root.children[i],ans+(char)(i+'a'),ansArr );
            }
        }
    }

    public static void main(String[] args){
        /*
        Find the "shortest unique prefix" for every word in a given list
        Assume no word is prefix of another.
        */
        String[] arr = {"zebra","dog","duck","dove"};
        for(int i=0;i<arr.length;i++){
            insert(arr[i]);
        }

        System.out.println(root.fre);

        root.fre = -1;
        ArrayList<String> ans =new ArrayList<>();
        findPrefix(root,"",ans);
        System.out.println(ans);


    }
}
