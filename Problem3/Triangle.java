package Problem3;

public class Triangle extends Shape {
    protected double side1, side2, side3;  // Change from private to protected

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        // Triangle inequality check
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
            System.out.println("Error: The sides do not form a valid triangle.");
            System.exit(1);  // Terminate the program if the sides don't form a valid triangle
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        double s = (side1 + side2 + side3) / 2;  // Semi-perimeter
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));  // Heron's formula
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
}

