import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;

public class BSTTest {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void insertTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
    }

    @Test
    public void toStringTest(){
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        assertTrue(Pattern.matches("\\s*\\[?\\s*1\\s*2\\s*3\\s*\\]?\\s*",
                                   bst.toString()));
    }

    @Test
    public void getExistsTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        assertEquals(3, bst.get(3));
    }

    @Test
    public void getNotExistsTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        assertEquals(-1, bst.get(4));
    }


    @Test
    public void removeLeafLeftTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.remove(1);
        assertTrue(Pattern.matches("\\s*\\[?\\s*2\\s*3\\s*\\]?\\s*",
                                   bst.toString()));
    }

    @Test
    public void removeLeafRightTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.remove(3);
        assertTrue(Pattern.matches("\\s*\\[?\\s*1\\s*2\\s*\\]?\\s*",
                                   bst.toString()));
    }

    @Test
    public void removeRootTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(3);
        bst.remove(2);
        assertTrue(Pattern.matches("\\s*\\[?\\s*1\\s*3\\s*\\]?\\s*",
                                   bst.toString()));
    }

    @Test
    public void removeRightWithSubTreeTest() {
        BST bst = new BST();
        bst.insert(2);
        bst.insert(1);
        bst.insert(7);
        bst.insert(4);
        bst.insert(3);
        bst.remove(7);
        assertTrue(Pattern.matches("\\s*\\[?\\s*1\\s*2\\s*3\\s*4\\s*\\]?\\s*",
                                   bst.toString()));
    }
}