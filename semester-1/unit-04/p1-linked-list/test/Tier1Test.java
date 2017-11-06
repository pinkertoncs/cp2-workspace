import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;

public class Tier1Test {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void emptyListLength() {
        List l = new List();
        assertEquals(l.length(), 0);
    }

    @Test
    public void simpleListLength() {
        List l = new List();
        l.push(new Person("a", "a"));
        l.push(new Person("b", "b"));
        l.push(new Person("c", "c"));
        assertEquals(l.length(), 3);
    }

    @Test
    public void simplePushTest() {
        List l = new List();
        l.push(new Person("a", "a"));
        l.push(new Person("b", "b"));
        l.push(new Person("c", "c"));
    }

    @Test
    public void simplePopTest() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);

        assertEquals(l.pop(), p2);
        assertEquals(l.pop(), p1);
        assertEquals(l.pop(), p);
    }

    @Test
    public void emptyListPop() {
        List l = new List();
        assertEquals(l.pop(), null);
        assertEquals(l.pop(), null);
    }

    @Test
    public void emptyListString() {
        List l = new List();
        assertTrue(Pattern.matches("\\s*\\[?\\s*\\]?\\s*", l.toString()));
    }

    @Test
    public void simpleToString() {
        List l = new List();
        l.push(new Person("a", "a"));
        l.push(new Person("b", "b"));
        l.push(new Person("c", "c"));

        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*b b\\s*c c\\s*\\]?\\s*",
                                   l.toString()));
    }

    @Test
    public void emptyListFind() {
        List l = new List();
        Person p = new Person("a", "a");
        assertEquals(l.find(p), -1);
    }

    @Test
    public void simpleListNotFound() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        assertEquals(l.find(p2), -1);
        
    }

    @Test
    public void simpleListFindRoot(){
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.find(p), 0);
    }

    @Test
    public void simpleListFindMid() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.find(p1), 1);
    }

    @Test
    public void simpleListFindEnd() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.find(p2), 2);
    }

    @Test
    public void emptyListGet() {
        List l = new List();
        assertEquals(l.get(1), null);
    }

    @Test
    public void getItemOutOfRange() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(-1), null);
    }

    @Test
    public void getItemOutOfRange2() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(5), null); 
    }

    @Test
    public void getItemRoot() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(0), p);
    }

    @Test
    public void getItemMid() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(1), p1);
    }

    @Test
    public void getItemEnd() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(2), p2);
    }

    @Test
    public void complexGet() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.get(0), p);
        assertEquals(l.get(1), p1);
        assertEquals(l.get(2), p2);
    }

    @Test
    public void bigTest() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        l.push(p2);
        assertEquals(l.length(), 3);
        l.pop();
        assertEquals(l.length(), 2);
        l.push(p2);
        l.push(p2);
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*b b\\s*c c\\s*c c\\s*\\]?\\s*",
                                   l.toString()));
        l.pop();
        assertEquals(l.find(p2), 2);
        l.pop();
        assertEquals(l.find(p2), -1);
        assertEquals(l.get(0), p);
        assertEquals(l.get(0), p);
        l.pop();
        l.pop();
        l.pop();
        assertEquals(l.get(0), null);
        assertEquals(l.length(), 0);
        assertTrue(Pattern.matches("\\s*\\[?\\s*\\]?\\s*", l.toString()));
        assertEquals(l.find(p), -1);
    }
}
