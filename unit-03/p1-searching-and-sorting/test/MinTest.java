import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MinTest {


    @Test
    public void singleElementTest() {

        double[] arr = new double[]{1};

        assertEquals(1, ArrayUtils.min(arr), .001);
        
    }

    @Test
    public void minTest() {

        double[] arr = new double[]{100,200,50, 5, 7, 1, 9};

        assertEquals(1, ArrayUtils.min(arr), .001);
    }

    @Test
    public void minTestNeg() {

        double[] arr = new double[]{100,-200,50, 5, 7, -1, 9};

        assertEquals(-200, ArrayUtils.min(arr), .001);
        
    }

    @Test
    public void minTestLast() {
        double[] arr = new double[]{9,8,7,6,5,4,3,2,1};

        assertEquals(1, ArrayUtils.min(arr), .001);
    }
}
