package Q2;

public class Rectangle extends Shape{

    private int length;
    private int width;

    public Rectangle(String color, int length, int width) {
        super(color);
        if(length <= 0) throw new IllegalArgumentException("Rectangle length should be more than 0");
        if(width <= 0) throw new IllegalArgumentException("Rectangle width should be more than 0");
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }
    @Override
    public String toString() {
        return "This is a " + this.color.toLowerCase() + " rectangle that has width of " + this.width + "cm and length of " + this.length + "cm that makes area of " + this.getArea() + "cm²";
    }
}
