import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void singleMaxTest() {
        double[] arr = new double[]{1};

        assertEquals(1, ArrayUtils.max(arr), .001);
    }

    @Test
    public void maxTest() {
        double[] arr = new double[]{100,200,50, 5, 7, 1, 9};

        assertEquals(200, ArrayUtils.max(arr), .001);
    }

    @Test
    public void maxTestLast() {
        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};

        assertEquals(9, ArrayUtils.max(arr), .001);
    }
}
