package Problem4;

public class Demo {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = {
            new Circle(5),
            new Ellipse(4, 3),
            new Triangle(3, 4, 5),
            new EquilateralTriangle(6)
        };

        // Print original objects
        System.out.println("Before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale the objects by a factor of 2
        scaleShapes(shapes, 2);

        // Print scaled objects
        System.out.println("\nAfter scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale shapes
    public static void scaleShapes(Scalable[] shapes, double scaleFactor) {
        for (Scalable shape : shapes) {
            shape.scale(scaleFactor);
        }
    }
}
