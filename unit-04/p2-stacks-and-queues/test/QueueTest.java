import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class QueueTest {

    @Test
    public void pushTest() {
        Queue q = new Queue();
        
        Queue.Order o1 = new Queue.Order();
        o1.name = "a";
        o1.time = 1;

        Queue.Order o2 = new Queue.Order();
        o2.name = "b";
        o2.time = 1;

        Queue.Order o3 = new Queue.Order();
        o3.name = "c";
        o3.time = 1;

        q.push(o1);
        assertEquals(1, q.size());

        q.push(o2);
        assertEquals(2, q.size());

        q.push(o3);
        assertEquals(3, q.size());
    }

    @Test
    public void popEmptyQueue() {
        Queue q = new Queue();
        assertEquals(null, q.pop());
    }

    @Test
    public void popQueue() {

        Queue q = new Queue();

        Queue.Order o1 = new Queue.Order();
        o1.name = "a";
        o1.time = 1;

        Queue.Order o2 = new Queue.Order();
        o2.name = "b";
        o2.time = 7;

        Queue.Order o3 = new Queue.Order();
        o3.name = "c";
        o3.time = 3;

        Queue.Order val;


        q.push(o1);
        assertEquals(1, q.size());

        q.push(o2);
        assertEquals(2, q.size());

        q.push(o3);
        assertEquals(3, q.size());

        val = q.pop();
        assertEquals("a", val.name);
        assertEquals(2, q.size());

        val = q.pop();
        assertEquals("c", val.name);
        assertEquals(1, q.size());

        val = q.pop();
        assertEquals("b", val.name);
        assertEquals(0, q.size());




    }

}