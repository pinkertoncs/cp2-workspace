import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import java.util.regex.Pattern;

public class Tier2Test {

    @Rule
    public Timeout globalTimeout = Timeout.seconds(10);

    @Test
    public void simpleInsertRoot() {
        List l = new List();
        l.insert(0, new Person("a", "a"));
        assertEquals(1, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*\\]?\\s*", l.toString()));
    }

    @Test
    public void insertAllRoot() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.insert(0, p);
        l.insert(0, p1);
        l.insert(0, p2);
        assertEquals(3, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*c c\\s*b b\\s*a a\\s*\\]?\\s*",
                                   l.toString()));
    }

    @Test
    public void insertatEndUsingLargeIndex() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.insert(100, p);
        l.insert(100, p1);
        l.insert(100, p2);
        assertEquals(3, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*b b\\s*c c\\s*\\]?\\s*",
                                   l.toString()));
    }

    @Test
    public void insertInMid() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.insert(0, p);
        l.insert(1, p1);
        l.insert(1, p2);
        assertEquals(3, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*c c\\s*b b\\s*\\]?\\s*",
                                   l.toString()));
    }

    @Test
    public void sortTest() {
        List l = new List();
        Person p = new Person("a", "a");
        Person p1 = new Person("b", "b");
        Person p2 = new Person("c", "c");
        l.insert(0, p);
        l.insert(0, p1);
        l.insert(0, p2);
        assertEquals(3, l.length());
        assertTrue(Pattern.matches("\\s*\\[?\\s*c c\\s*b b\\s*a a\\s*\\]?\\s*",
                                  l.toString()));
        l.sort();
        assertTrue(Pattern.matches("\\s*\\[?\\s*a a\\s*b b\\s*c c\\s*\\]?\\s*",
                                   l.toString()));
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
        assertEquals(p2, l.pop(2));
        assertEquals(p1, l.pop(1));
        assertEquals(p, l.pop(0));
    }

    @Test
    public void popEmptyList() {
        List l = new List();
        assertEquals(null, l.pop(0));
    }  
}
