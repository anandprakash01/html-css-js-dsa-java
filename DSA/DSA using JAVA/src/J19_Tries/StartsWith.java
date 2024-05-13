package J19_Tries;

public class StartsWith {
    /*  Create a function boolean startsWith(String prefix) for a trie.
        Returns true if there is previously inserted string word that has the prefix otherwise
    */
    static class Node{
        Node[] children = new Node[26];
        boolean eow = false; // No need for end of word here
        Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
        }
    }
    static Node root = new Node();

    public static void insert(String s){
        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int idx=s.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
    }

    public static boolean startsWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx]==null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args){
        String[] words = {"apple", "mango", "man", "woman"};
        String prefix1 = "app";
        String prefix2 = "moon";

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        System.out.println(startsWith(prefix2));
    }

}
