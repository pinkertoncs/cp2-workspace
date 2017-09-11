public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("Simple tests:");
    
        Data d = new Data();
    
        d.setInt(10);
        System.out.println(d.getBin());
               
        d.setHex('A');
        System.out.println(d.getInt());
    
        d.setBin("1011");
        System.out.println(d.getHex());
    
        System.out.println(
            "\nDEC\tHEX\tBIN\t");
        System.out.println("--\t--\t--");
            
        for( int i=0; i<16; i++){
            
            d.setInt(i);
            
            // test getters
            System.out.println(
                d.getInt() + "\t" +
                d.getHex() + "\t" +
                d.getBin() + "\t");
        } 
    }
}    