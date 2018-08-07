import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;
import java.util.Arrays;

public class BinarySearchTest {

    private void genRandomArray(double[] array) {

        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {

            array[i] = 100* rand.nextDouble();
        }
    }

    @Test
    public void emptyListTest(){

        double[] arr = new double[]{};

        assertEquals(-1, ArrayUtils.binarySearch(arr,0));
    }

    @Test
    public void singleItemFind(){

        double[] arr = new double[]{4};

        assertEquals(0, ArrayUtils.binarySearch(arr,4));
    }

    @Test
    public void singleItemNotFind() {

        double[] arr = new double[]{4};

        assertEquals(-1, ArrayUtils.binarySearch(arr,5));
    }

    @Test
    public void binarysearch() {

        Random rand = new Random();
        
        double[] arr = new double[100];
        
        genRandomArray(arr);
        Arrays.sort(arr);
        
        int indx = Arrays.binarySearch(arr, arr[62]);
        int indx1 = ArrayUtils.binarySearch(arr, arr[62]);

        assertEquals(indx, indx1);
    }
}
