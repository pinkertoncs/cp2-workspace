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
        assertEquals(0, l.length());
    }

    @Test
    public void simpleListLength() {
        List l = new List();
        l.push(new Person("a", "a"));
        l.push(new Person("b", "b"));
        l.push(new Person("c", "c"));
        assertEquals(3, l.length());
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

        assertEquals(p2, l.pop());
        assertEquals(p1, l.pop());
        assertEquals(p, l.pop());
    }

    @Test
    public void emptyListPop() {
        List l = new List();
        assertEquals(null, l.pop());
        assertEquals(null, l.pop());
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
        assertEquals(-1, l.find(p));
    }

    @Test
    public void simpleListNotFound() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.push(p);
        l.push(p1);
        assertEquals(-1, l.find(p2));
        
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
        assertEquals(0, l.find(p));
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
        assertEquals(1, l.find(p1));
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
        assertEquals(2, l.find(p2));
    }

    @Test
    public void emptyListGet() {
        List l = new List();
        assertEquals(null, l.get(1));
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
        assertEquals(null, l.get(-1));
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
        assertEquals(null, l.get(5)); 
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
        assertEquals(p, l.get(0));
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
        assertEquals(p1, l.get(1));
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
        assertEquals(p2, l.get(2));
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
        assertEquals(p, l.get(0));
        assertEquals(p1, l.get(1));
        assertEquals(p2, l.get(2));
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
        assertEquals(3, l.length());
        l.pop();
        assertEquals(2, l.length());
        l.push(p2);
        l.push(p2);
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*b b\\s*c c\\s*c c\\s*\\]?\\s*",
                                   l.toString()));
        l.pop();
        assertEquals(2, l.find(p2));
        l.pop();
        assertEquals(-1, l.find(p2));
        assertEquals(p, l.get(0));
        assertEquals(p, l.get(0));
        l.pop();
        l.pop();
        l.pop();
        assertEquals(null, l.get(0));
        assertEquals(0, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*\\]?\\s*", l.toString()));
        assertEquals(-1, l.find(p));
    }
}
