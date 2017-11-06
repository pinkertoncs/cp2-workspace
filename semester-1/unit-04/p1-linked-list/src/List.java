public class List {
    
    private class Node {
        public Person data;
        // required
        public Node next;
        // optional, if you are implementing a doubly linked list
        public Node prev;
    }
    
    private Node root = null;
    
    public List() {
    
    }
    
    public int length() {
        return -1;
    }
    
    public String toString() {
        return "";
    }
    
    public void push(Person p){
    }
    
    public void insert(int index, Person p){
    }
    
    public Person get(int index){
        return null;
    }
    
    public int find(Person p){
        return -1;
    }
    
    public Person pop(){
        return null;
    }
    
    public Person pop(int index){
        return null;
    }
    
    public void sort(){
    }
    
    /* ---- Helper methods ---- */
    // might be useful for sort
    private void swap(Node a, Node b){
    }
}
    