package shapes;

public class Main {
    public static void main(String[] args) {
        // Create shape objects
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(8, 12);
        Shape triangle = new Triangle(10, 12, 15);

        // Add shapes to an array
        Shape[] shapes = {square, rectangle, triangle};

        // Create ShapeCollection object
        ShapeCollection shapeCollection = new ShapeCollection(shapes);

        // Call the displayProperties method
        shapeCollection.displayProperties();
    }
}