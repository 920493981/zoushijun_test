package Test7;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle (double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double rectArea(){
        return this.length * this.width;
    }
}
