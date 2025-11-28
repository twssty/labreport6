abstract class DrawableShape {
    private int centerX;
    private int centerY;
    private String color;
    

    public DrawableShape(int x, int y, String color) {
        this.centerX = x;
        this.centerY = y;
        this.color = color;
    }
    
    public int getX() {
        return centerX;
    }
    
    public int getY() {
        return centerY;
    }
    
    public String getColor() {
        return color;
    }
    
    public void setX(int x) {
        this.centerX = x;
    }
    
    public void setY(int y) {
        this.centerY = y;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public void move(int x, int y) {
        this.centerX += x;
        this.centerY += y;
    }
    
}