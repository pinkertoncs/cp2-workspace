import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void emptyListTest() {

        double[] arr = new double[]{};
        
        assertEquals(-1, ArrayUtils.linearSearch(arr, 0)); 
    }

    @Test
    public void oneElementFind() {

        double[] arr = new double[]{1};
        
        assertEquals(0, ArrayUtils.linearSearch(arr, 1));
    }

    @Test
    public void oneElementNoFind() {

        double[] arr = new double[]{1};
        
        assertEquals(-1, ArrayUtils.linearSearch(arr, 7));
    }


    @Test
    public void findElementFront() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(0, ArrayUtils.linearSearch(arr, 1));
    }

    @Test
    public void findElementEnd() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(8, ArrayUtils.linearSearch(arr, 9));
    }

    @Test
    public void findElementMiddle() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(4, ArrayUtils.linearSearch(arr, 5));
    }
}
