package shapes;

public class Main {
    public static void main(String[] args) {

        Shape square = new Square(10);
        Shape rectangle = new Rectangle(8, 12);
        Shape triangle = new Triangle(10, 12, 15);

        Shape[] shapes = {square, rectangle, triangle};

        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        shapeCollection.displayProperties();
    }
}