public class Rectangle {
    
    private int width;
    private int height;
    
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }
    
    public void setWidth(int w) {
        this.width = w;
    }
    
    public void setHeight(int h) {
        this.height = h;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    /*
    * A.) implement the remaining functions as an exercise
    */
    public String toString(){} 
    public void setDimensions(int w, int h){}
    public int getArea(){}
}
    