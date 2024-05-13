package J19_Tries;

public class WordBreak {

    static class Node{
        Node[] children = new Node[26];
        boolean eow = false; // EndOfWord

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root =new Node();

    public static void insert(String word){
        Node curr = root;
        for(int level=0; level<word.length(); level++){
            int idx=word.charAt(level) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx]=new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int level=0; level<key.length(); level++){
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr=curr.children[idx];
        }
        return curr.eow == true;
    }

    public static boolean wordBreak(String key){ // O(L)

        if(key.length() == 0) return true;

        for(int i=1; i<=key.length(); i++){
            if( search(key.substring(0,i)) && wordBreak(key.substring(i)) ){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){

        /*
        Given an input string and dictionary of words, find out input string can be broken
        into a space separated sequence of dictionary words.
        */

//        String[] words = {"i", "like", "sam", "samsung", "moblie", "itc"};
//        String key = "ilikesamsung";

        String[] words = {"a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"};
        String key = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
//        String[] words = {"apple","pen"};
//        String key = "applepenapple";



        for(String word : words){
            insert(word);
        }

        System.out.println(wordBreak(key));
    }
}
