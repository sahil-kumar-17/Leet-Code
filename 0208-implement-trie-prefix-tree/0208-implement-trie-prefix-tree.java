class Node {
    Node[] child;
    boolean eow;

    Node() {
        this.child = new Node[26];
        this.eow = false;
    }
}

class Trie {
    Node root;

    public Trie() {
       this.root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.child[i] == null) {
                curr.child[i] = new Node();
            }
            curr = curr.child[i];
        }
        curr.eow = true;
    }

    public boolean search(String word) {
        Node curr = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (curr.child[i] == null)
                return false;
            curr = curr.child[i];
        }
        return curr.eow;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;

        for (char c : prefix.toCharArray()) {
            int i = c - 'a';
            if (curr.child[i] == null)
            return false;
            curr = curr.child[i];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */