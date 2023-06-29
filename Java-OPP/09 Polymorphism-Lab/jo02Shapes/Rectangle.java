package Java_OOP._09PolymorphismLab.jo02Shapes;

public class Rectangle extends Shape{
    private Double height;
    private Double width;

    public Rectangle(Double height, Double width) {
        this.height = height;
        this.width = width;
        this.calculatePerimeter();
        this.calculateArea();

    }

    public final Double getHeight() {
        return height;
    }

    public final Double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * this.height + 2 * this.width);
    }
    @Override
    public void calculateArea() {
        setArea(height * width);
    }
}
