import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LinearSearchTest {

    @Test
    public void emptyListTest() {

        double[] arr = new double[]{};
        
        assertEquals(ArrayUtils.linearSearch(arr, 0), -1); 
    }

    @Test
    public void oneElementFind() {

        double[] arr = new double[]{1};
        
        assertEquals(ArrayUtils.linearSearch(arr, 1), 0);
    }

    @Test
    public void oneElementNoFind() {

        double[] arr = new double[]{1};
        
        assertEquals(ArrayUtils.linearSearch(arr, 7), -1);
    }


    @Test
    public void findElementFront() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(ArrayUtils.linearSearch(arr, 1), 0);
    }

    @Test
    public void findElementEnd() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(ArrayUtils.linearSearch(arr, 9), 8);
    }

    @Test
    public void findElementMiddle() {

        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};
        
        assertEquals(ArrayUtils.linearSearch(arr, 5), 4);
    }
}
