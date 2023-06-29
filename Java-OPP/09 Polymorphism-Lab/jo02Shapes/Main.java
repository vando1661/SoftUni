package Java_OOP._09PolymorphismLab.jo02Shapes;
public class Main {
    public static void main(String[] args) {
    Shape rectangle = new Rectangle(2.00,4.00);
    Shape circle = new Circle(13.4);
        /*printShape(rectangle);
        printShape(circle);*/
        System.out.println(circle.getArea());


    }
    /*public static void printShape(Shape shape){
        System.out.println(shape.);
        System.out.println(shape.calculateArea());
    }*/
}
