import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import java.util.Arrays;
import java.util.Random;

public class InsertionSortTest {

    private void genRandomArray(double[] array) {

        Random rand = new Random();

        for(int i = 0; i < array.length; i++) {

            array[i] = 100* rand.nextDouble();
        }
    }


    @Test
    public void sortEmptyList() {

        double[] arr1 = new double[]{};
        double[] arr2 = new double[]{};

        Arrays.sort(arr1);
        ArrayUtils.insertionSort(arr2);
        assertArrayEquals(arr1,arr2, 0.001);
        
    }


    @Test
    public void sortSingleItemList() {

        double[] arr1 = new double[]{7};
        double[] arr2 = new double[]{7};

        Arrays.sort(arr1);
        ArrayUtils.insertionSort(arr2);
        assertArrayEquals(arr1,arr2, 0.001);
    }

    @Test
    public void nominalSort() {

        double[] arr1 = new double[100];

        genRandomArray(arr1);

        double[] arr2 = Arrays.copyOf(arr1,arr1.length);

        Arrays.sort(arr1);
        ArrayUtils.insertionSort(arr2);

        assertArrayEquals(arr1,arr2, 0.001);
    }
}
