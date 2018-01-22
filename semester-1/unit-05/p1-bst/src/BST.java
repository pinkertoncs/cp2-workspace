public class BST {

    /*
     * internal Node class. Stores ans number and references to the left and right subtrees
     */
    class Node {
        public int number;
        Node left = null;
        Node right = null;
    }

    private Node root;
    
    /*
     * insert the number into the correct position in the tree 
     */
    public void insert(int number) {
    }
    
    /*
     * recursive helper function for insert
     */
    private void insertHelper(Node n, int val) {
    } 
    
    /*
     * returns the number if it is in the tree -1 otherwise
     */
    public int get( int n ) {
        return -1;
    }
    
    /*
     * recursive helper function for get
     */
    private int getHelper(Node n, int val) {
        return -1;
    }
    
    /*
     * removes the first occurence of n in the tree,
     * updates the tree accordingly
     */
    public void remove( int n ) {
    }
    
    /*
     * helper function to find them in node in a given tree
     */
    private Node find_min(Node n) {
        Node current_node = n;
        while(current_node.left != null) {
            current_node = current_node.left;
        }
        return current_node;
    }
    
    /*
     * recursive helper function for remove
     */
    private void removeHelper(Node n, Node parent, int val) {
    }
    
    /*
     * returns the string representation from an inOrder traversal
     */
    public String toString() {
        return "";
    }
    
    /*
     * recursive helper function for toString
     */
    private String stringHelper(Node n) {
        return "";
    }
    
    /*
     * These methods print a BST in a tree-like form
     * code adapted from
     * http://stackoverflow.com/questions/4965335/how-to-print-binary-tree-diagram
     */
    
    public void printTree(){
        printBinaryTree(root, 0);
    }

    private void printBinaryTree(Node n, int level){
        if(n==null)
            return;
        printBinaryTree(n.right, level+1);
        if(level!=0){
            for(int i=0;i<level-1;i++)
                System.out.print("|\t");
            System.out.println("|-------"+n.number);
        }
        else
            System.out.println(n.number);
        printBinaryTree(n.left, level+1);
    }
}