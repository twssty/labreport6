
class Square extends DrawableShape{
    private int sideLength;
    Square(int x, int y, String color, int sideLength){
        super(x, y, color);
        this.sideLength = sideLength;
        
    }
    public int getSideLength(){
        return sideLength;
    }
    public void setSideLength(int sideLength){
        this.sideLength = sideLength;
    }
    public int getArea(){
        return sideLength * sideLength;
    }
    public int getPerimeter(){
        return 4 * sideLength;
    }
    public void draw(){
        for(int i = 0; i < sideLength; i++){
            System.out.print("*");
        }
        System.out.println();

        for(int j = 0;  j < sideLength; j++){
            System.out.print("*");
            for(int k = 0; k < sideLength - 2; k++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for(int l = 0; l < sideLength; l++){
            System.out.print("*");
        }

    }
}