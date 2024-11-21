package Problem3;

public class Demo {
    public static void main(String[] args) {
        // Create objects of different shapes
        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Ellipse(7.0, 3.0);
        shapes[2] = new Triangle(3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle(6.0);

        // Loop through the shapes array and print details
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}

