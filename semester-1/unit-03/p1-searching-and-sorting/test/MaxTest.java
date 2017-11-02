import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MaxTest {

    @Test
    public void singleMaxTest() {
        double[] arr = new double[]{1};

        assertEquals(ArrayUtils.max(arr), 1, .001);
    }

    @Test
    public void maxTest() {
        double[] arr = new double[]{100,200,50, 5, 7, 1, 9};

        assertEquals(ArrayUtils.max(arr), 200, .001);
    }

    @Test
    public void maxTestLast() {
        double[] arr = new double[]{1,2,3,4,5,6,7,8,9};

        assertEquals(ArrayUtils.max(arr), 9, .001);
    }
}
