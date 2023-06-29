package Java_OOP._09PolymorphismLab.jo02Shapes;

public class Circle extends Shape{
    private Double radius;

    public Circle(Double radius){
        this.radius = radius;
        this.calculatePerimeter();
        this.calculateArea();
    }

    public final Double getRadius() {
        return radius;
    }

    @Override
    public void calculatePerimeter() {
        setPerimeter(2 * Math.PI * radius);
    }
    @Override
    public void calculateArea() {
        setArea(Math.PI * radius * radius);
    }
}
