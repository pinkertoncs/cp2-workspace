import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestData {

    int[] decimals = new int[]{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    String[] bins = new String[]{"0000", "0001", "0010", "0011", "0100",
                                 "0101", "0110", "0111", "1000", "1001",
                                 "1010", "1011", "1100", "1101", "1110",
                                 "1111"};
    char[] hex = new char[]{'0','1', '2', '3', '4', '5', '6', '7', '8', '9',
                            'A', 'B', 'C', 'D', 'E', 'F'};


    
    @Test
    public void testDefaultConstructor(){
        Data d = new Data();
        assertEquals(0, d.getInt());
        assertEquals('0', d.getHex());
        assertEquals("0000", d.getBin());
    }

    @Test
    public void test1ArgConstructor(){
        for(int i = 0; i < decimals.length; i++) {
            Data d = new Data(decimals[i]);

            assertEquals(decimals[i], d.getInt());
            assertEquals(bins[i], d.getBin());
            assertEquals(hex[i], d.getHex());
        }
    }

    @Test
    public void testSetInt() {
        for(int i = 0; i < decimals.length; i++) {
            Data d = new Data();
            d.setInt(decimals[i]);
            
            assertEquals(decimals[i], d.getInt());
            assertEquals(bins[i], d.getBin());
            assertEquals(hex[i], d.getHex());

        }
    }

    @Test
    public void testSetBin() {
        for(int i = 0; i < decimals.length; i++) {
            Data d = new Data();
            d.setBin(bins[i]);

            assertEquals(decimals[i], d.getInt());
            assertEquals(bins[i], d.getBin());
            assertEquals(hex[i], d.getHex());
            
        }
    }

    @Test
    public void testSetHex() {
        for(int i = 0; i < decimals.length; i++) {
            Data d = new Data();
            d.setHex(hex[i]);

            assertEquals(decimals[i], d.getInt());
            assertEquals(bins[i], d.getBin());
            assertEquals(hex[i], d.getHex());
        }
    }
}
