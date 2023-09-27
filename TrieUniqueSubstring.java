public class TrieUniqueSubstring {
    static class Node{
        Node children[] = new Node[26];
        boolean eow = false;

        Node(){
            for(int i=0; i<26; i++){
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String str){
        Node curr = root;
        for(int i=0; i<str.length(); i++){
            int idx = str.charAt(i)-'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i=0; i<key.length(); i++){
            int idx = key.charAt(i)-'a';
            if(curr.children[idx] == null){
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow == true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(root.children[i]!=null){
                count+=countNodes(root.children[i]);
            }
        }

        return count+1;
    }
    public static void main(String[] args) {
        String str = "ababa";
        //suffix
        for(int i=0; i<str.length(); i++){
            insert(str.substring(i));
        }

        System.out.println(countNodes(root));
    }
}
