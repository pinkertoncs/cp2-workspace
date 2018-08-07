import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StackTest {

    @Test
    public void pushTest() {
        Stack s  = new Stack();
        s.push(1);
        assertEquals(1, s.size());
        s.push(2);
        assertEquals(2, s.size());
        s.push(3);
        s.push(4);
        assertEquals(4, s.size());
    }

    @Test
    public void popEmptyStack() {
        Stack s  = new Stack();
        assertEquals(null, s.pop());
    }

    @Test
    public void popStack() {
        Stack s  = new Stack();
        int val;
        s.push(1);
        assertEquals(1, s.size());
        s.push(2);
        assertEquals(2, s.size());
        val = s.pop();
        assertEquals(2, val);
        assertEquals(1, s.size());
        s.push(3);
        s.push(4);
        assertEquals(3, s.size());

        val = s.pop();
        assertEquals(4, val);
        assertEquals(2, s.size());
        val = s.pop();
        assertEquals(3, val);
        assertEquals(1, s.size());
        val = s.pop();
        assertEquals(1, val);
        assertEquals(0, s.size());

    }


}