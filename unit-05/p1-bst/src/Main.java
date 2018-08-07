

public class Main {

    public static void main(String[] args) {

        BST bst = new BST();

        int[] xx = new int[]{5, 1, 9, 0, 3, 2, 4};

        for(int x : xx) {
            bst.insert(x);
        }

        System.out.println(bst.toString());

        int y = bst.get(3);

        if( y == -1 ) {
            System.err.println("Not Found");
        } else {
            System.out.println("found: " + y);
        }

        y = bst.get(8);
        if( y == -1 ) {
            System.err.println("Not Found");
        } else {
            System.out.println("found: " + y);
        }
        
        bst.printTree();
        
        for(int x : xx) {
            bst.remove(x);
            System.out.println();
            bst.printTree();
        }

        System.out.println("--done\n" + bst.toString());
    }
}
