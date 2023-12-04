package Q2;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(String color, int base, int height){
        super(color);
        if(base <= 0) throw new IllegalArgumentException("Triangle base should be more than 0");
        if(height <= 0) throw new IllegalArgumentException("Triangle height should be more than 0");
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * this.base * this.height;
    }

    @Override
    public String toString() {
        return "This is a " + this.color.toLowerCase() + " triangle that has base of " + this.base + "cm and height of " + this.height + "cm that makes area of " + this.getArea() + "cm²";
    }
}
